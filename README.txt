Alunos: 
Ana Carolina de Sousa Ferreira

Para a conexão da base de dados, é necessário baixar o mysql-connector-java-5.1.45.zip anexado no projeto,
extrair ele na seguinte pasta "C:\Program Files (x86)\MySQL".
Logo após, voltar ao eclipse, abrir a aba "Data Source Explorer";
Clicar com o botão direito >> New >> MySQL >> next >> New Drive Definition;
Seleciona o com a versão 5.1, vai na aba "JAR list", "Clear";
Clica em "Add JAR", vai na pasta "C:\Program Files (x86)\MySQL\mysql-connector-java-5.1.45" e seleciona o .jar;
Clica em Ok;
E configura a conexão
fica o seguinte:

Database: db_was
URL: jdbc:mysql://localhost:3306/db_was

seu usuário e senha.
(Recomentado testar a conexão)

Finish.

Logo após, vai no projeto, clica com o botão direito e vai em "Properties"
Vai na aba JPA.
Localiza onde tem Connection e seleciona a conexão que acabara de conectar.
Apply and close.

=======================================================================================================================

For a database connection, you need to download the attached mysql-connector-java-5.1.45.zip in the project,
Extract it into the "C: \ Program Files (x86) \ MySQL" folder.
Then, return to the eclipse, open a "Data Source Explorer" tab;
Right-click >> New >> MySQL >> next >> New drive definition;
Select the one with the version 5.1 and go to "JAR List", click on "Clear all";
Click on "Add JAR", go to the "C: \ Program Files (x86) \ MySQL \ mysql-connector-java-5.1.45" folder and select the .jar;
Press Ok;
Establish the connection

Looks like:

Database: db_was
URL: jdbc: mysql: // localhost: 3306 / db_was

your username and password.
(Recommended test connection)

CLick on Finish.

Then, go to the project, right-click and go in "Properties"
Then, you go on the JPA tab.
Locates the "Connection" and selects a connection that you have finished connecting.
Apply and close.
