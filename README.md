<div align="center">
  <h1>:card_file_box: Gerador-Horoscopo  </h1>
  <h2>Projeto bimestral - Linguagens de Programação III</h2>
  <p align="left">Desenvolva uma aplicação web que simule a apresentação do horóscopo diário para um determinado usuário. Como não somos astrólogos e ainda não aprendemos como acessar web services, vamos contar com um arquivo texto onde cada linha possui a identificação de um signo, uma imagem que o represente e sua previsão astrológica.</p>
  
  <p aling="center">horoscopo.txt</p>
<p aling="center">aries#aries.png#previsão para áries</p>
<p aling="center">sagitário#sagitario.png#previsão para sagitário</p>
<p aling="center">... </p>
</div>

<hr/>

## Tecnologias utilizadas
- HTML
- JSP
- Jquery
- Ajax
- Servlet
- Java

## Desafios Proposto
- [x] [HTML] A aplicação deve possuir uma tela de login para acesso ao "formulário de solicitação do horóscopo diário". 
- [x] [JSP] O formulário só pode ser acessado, após a validação do login e senha do usuário,  onde o login deve ser um email sintaticamente válido e a senha será a primeira parte do email (antes do @) invertida. Após validado, os dados do usuário deverão ser armazenados na sessão. Faça a validação utilizando um servlet.
- [x] A tela de "formulário para solicitação do horóscopo diário" deve solicitar a data de nascimento  ao usuário e após a data ser informada, a previsão do horóscopo será apresentada na mesma tela (por reload ou AJAX), junto com uma imagem que representa o signo do usuário. A tela ainda deve possuir um link para logout, invalidando a sessão [SERVLET] e redirecionando para a tela de login.
- [x] Utilize classe(s) [JAVA] para identificar o signo de uma pessoa de acordo com o mês e ano de seu nascimento e para recuperar um determinado horóscopo do arquivo texto

<hr/>

## Feedback

Feedback é sempre bem-vindo, se você tiver qualquer sugestão ou duvida por favor me enviar um e-mail: gcgonzalez99@hotmail.com
