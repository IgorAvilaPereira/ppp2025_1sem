<?php

error_reporting(E_ALL);
ini_set('display_errors', 1);
    
interface Observer {
    public function update(string $mensagem): void;  
    public function updateChannel($youtubeChannel, $mensagem): void;  
}

interface Subject {
    public function addObserver($observer): void;
    public function removeObserver($indice): void;
    public function notifyObservers(): void;
    
}

// classe concreta (entidade observavel) que deve implementar o contrato da interface subject
class Youtubechannel implements Subject {
    private string $nome;
    private string $endereco;
    private array $videos;
    private array $vetObservadores;
    
    public function __construct($nome){
        $this->nome = $nome;
    } 
    
    public function getVideos() {
        return $this->videos;
    }
    
    public function getNome(): string {
        return $this->nome;
    }
    
//  metodo foco -> metodo importante para os observadores
    public function changedState($novo_video) {
        $this->videos[] = $novo_video;
        $this->notifyObservers();
    }
    
    // add novo observador
    public function addObserver($observer): void {
        $this->vetObservadores[] = $observer;
    }
    
    // removo observador por indice
    public function removeObserver($indice): void {
        unset($this->vetObservadores[$indice]);
    }
    
    // notifico todos observadores
    public function notifyObservers(): void {    
        foreach ($this->vetObservadores as $observador) {
//            $observador->update("novo video");
            $observador->updateChannel($this, "novo video");
        }
    }
    
}

// primeira classe concreta que implementa um tipo de observador
class Pessoa implements Observer {
    private string $nome;
    
    public function __construct($nome) {
        $this->nome = $nome;
    }
    
    public function update(string $mensagem): void {
        echo $this->nome . ":". $mensagem."<br>";
    } 
    
    public function updateChannel($youtubeChannel, $mensagem): void {
        echo $this->nome . ": $mensagem de ". $youtubeChannel->getNome();
    }  
} 

// segunda classe concreta que implementa um tipo de observador
class Empresa implements Observer {

    private string $nome;
    private string $cnpj;
    
    public function __construct($nome) {
        $this->nome = $nome;
    }
    
    public function update(string $mensagem): void {
        /*
            -- username: postgres password: postgres
            
            CREATE DATABASE david_carnaval;
            
            \c david_carnaval;
            
            CREATE TABLE log ( 
                id serial primary key, 
                mensagem text
           );

        */
    
    
        // Dica: seria interessante tratar excecoes, e ter uma classe especifica de conexao 
        $dbconn = pg_connect("host=localhost dbname=david_carnaval user=postgres password=postgres") or die('Could not connect: ' . pg_last_error());

        // Executando instrucoes SQL em uma base de dados PostgreSQL
        $query = "INSERT INTO log (mensagem) VALUES ('".$mensagem."');";
        
        // ou OK, ou die: Para a execucao de script!        
        $result = pg_query($dbconn, $query) or die('Query failed: ' .               pg_last_error());
        
        echo $this->nome.": gravou a mensagem! <br>";

    } 
    
    public function updateChannel($youtubeChannel, $mensagem): void {
        echo $this->nome . ": $mensagem de ". $youtubeChannel->getNome();
    } 
}

$igorChannel = new Youtubechannel("Canal do Igor");

$david = new Pessoa("David");
$felipe = new Pessoa("Felipe");

$igorChannel->addObserver($david);
$igorChannel->addObserver($felipe);

$igorChannel->changedState("video aula de observer em php");

echo "<hr>";

$jaifer = new Pessoa("Jaifer");
$ifrs = new Empresa("IFRS");

$igorChannel->addObserver($jaifer);
$igorChannel->addObserver($ifrs);

echo "<hr>";

$igorChannel->changedState("video aula de strategy");


?>
