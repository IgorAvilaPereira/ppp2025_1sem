### Trabalho Facade


**Problema: Biblioteca de Processamento de Imagens**

Vamos imaginar que você está construindo uma aplicação que precisa realizar várias manipulações de imagem. Uma biblioteca de processamento de imagens robusta pode ter muitas classes de baixo nível.

* **O Subsistema Complexo (Classes de Baixo Nível):**
    * `ImageLoader` (Carregador de Imagens): Lida com o carregamento de vários formatos de imagem (JPEG, PNG, BMP).
    * `FilterApplier` (Aplicador de Filtros): Aplica diferentes filtros de imagem (escala de cinza, sépia, desfoque, nitidez).
    * `Resizer` (Redimensionador): Altera as dimensões da imagem.
    * `ColorConverter` (Conversor de Cores): Converte entre modelos de cores (RGB, CMYK).
    * `ImageSaver` (Salvador de Imagens): Salva a imagem processada de volta em diferentes formatos.
    * `ThumbnailGenerator` (Gerador de Miniaturas): Cria versões menores das imagens.

**O que deve ser feito:**
Implemente a Fachada (ImageProcessorFacade): esta fachada deve oferecer operações simples como "criar uma miniatura sépia" ou "redimensionar e converter para escala de cinza".

* **Os Benefícios que o seu código deve trazer:** O código cliente (`Main.java`) não precisa saber a sequência específica de chamadas ou os detalhes de cada operação de imagem de baixo nível. Ele simplesmente chama um único método na `ImageProcessorFacade`, tornando as tarefas de processamento de imagem muito mais simples de iniciar e gerenciar. Isso **reduz o acoplamento** entre o cliente e a biblioteca subjacente de processamento de imagens.


