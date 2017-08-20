# voo
Cadastro de Voo

Procedimentos para execução :

1) Ao gerar o deploy do arquivo war , chamar o url http://localhost:8080/voo/  e dar enter

para fazer o carregamento das informações do site https://swapi.co/ para a memória (tripulante,nave e planeta)
Tive problema para acesso do https://swapi.co/ e gravei os dados do site no site http://www.mocky.io/ .Portanto
a busca foi feita no site http://www.mocky.io/ as informações do tripulante,nave e planeta.


Sequencia automatica até aparecer a página para cadastrar o voo:
Vai chamar a pagina index.jsp  (automatico)
Em seguida vai chamar o servlet chamaservico  (automatico)
e depois chama a pagina voo.xhtml  (automatico)



Resumo sobre os pacotes :

br.com.voo   -> existe classes referente a chamada cliente para o webservice
br.com.voo.dao -> existe classes referente ao DAO
br.com.voo.model -> existe classes referente ao POJO
br.com.voo.managedBean -> existe classes referente ao controler do JSF



Problemas:

1)Ao chamar a url dentro da classe HttpNave aprsentou o seguinte erro
Caused by: java.io.IOException: Server returned HTTP response code: 403 for URL: https://swapi.co/api/starships/9/

Alternativa salvei o conteudo do json do site swapi no site http://www.mocky.io/ pois ai consegui
a chamar a classe e obter o resultado do json

2) Ao gerar build pelo eclipse está dando erro :
[ERROR] No compiler is provided in this environment. Perhaps you are running on a JRE rather than a JDK?

Quando faço :
Pela Eclipse : Run As / Maven Build /Goals : clean install  
 Botão Run (APertar)
 
 
 Mas se executar via cmd o comando : mvn clean package install
 
 [INFO] --- maven-war-plugin:2.2:war (default-war) @ Voo ---
 [INFO] Packaging webapp
 [INFO] Assembling webapp [Voo] in [C:\tmp\workspace\voo\target\voo]
 [INFO] Processing war project
 [INFO] Copying webapp resources [C:\tmp\workspace\voo\src\main\webapp]
 [INFO] Webapp assembled in [3500 msecs]
 [INFO] Building war: C:\tmp\workspace\voo\target\voo.war
[INFO] WEB-INF\web.xml already added, skipping

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 58.213 s
[INFO] Finished at: 2017-08-20T03:11:11-03:00
[INFO] Final Memory: 20M/150M
[INFO] ------------------------------------------------------------------------
