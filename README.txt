Alunos: 
Ana Carolina de Sousa Ferreira
Sergiany Diniz do Nascimento
Wesley Morais de Araujo

Para a conex�o da base de dados, � necess�rio baixar o mysql-connector-java-5.1.45.zip anexado no projeto,
extrair ele na seguinte pasta "C:\Program Files (x86)\MySQL".
Logo ap�s, voltar ao eclipse, abrir a aba "Data Source Explorer";
Clicar com o bot�o direito >> New >> MySQL >> next >> New Drive Definition;
Seleciona o com a vers�o 5.1, vai na aba "JAR list", "Clear";
Clica em "Add JAR", vai na pasta "C:\Program Files (x86)\MySQL\mysql-connector-java-5.1.45" e seleciona o .jar;
Clica em Ok;
E configura a conex�o
fica o seguinte:

Database: db_was
URL: jdbc:mysql://localhost:3306/db_was

seu usu�rio e senha.
(Recomentado testar a conex�o)

Finish.

Logo ap�s, vai no projeto, clica com o bot�o direito e vai em "Properties"
Vai na aba JPA.
Localiza onde tem Connection e seleciona a conex�o que acabara de conectar.
Apply and close.