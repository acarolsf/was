Alunos: 
Ana Carolina de Sousa Ferreira
Sergiany Diniz do Nascimento
Wesley Morais de Araujo

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