
## PASSO A PASSO PARA O CONSUMO BÁSICO DE UMA API VIA HTTPCLIENT

PASSO 01: INSTANCIAR UM OBJETO DO TIPO HTTPCLIENT;

```
HttpClient httpClient = HttpClient.newHttpClient();
```
        
PASSO 02: CRIAÇÃO DE UMA URI PARA CONTER O ENDEREÇO DA REQUISIÇÃO QUE SERÁ CHAMADO;

```
URI uri;
uri = new URI(url);
```

PASSO 03: CRIAR UM OBJETO DO TIPO HTTPREQUEST PARA CRIAR A REQUISIÇÃO PARA A API;
	
```
HttpRequest httpRequest = HttpRequest.newBuilder().uri(uri).GET().build();
```
	            
PASSO 04: ENVIANDO A REQUISIÇÃO PARA O SERVIDOR E OBTENDO A RESPOSTA;

```
HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
```



### Lib Gson (Caso queria converter json -> entity):
* Usar a dependência do Gson:
```
<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
		<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>2.10.1</version>
		</dependency>
```
* Criação do objeto da classe que será a entidade

```
BrasilApi brasilApi = new BrasilApi();
```

* Criação do objeto Gson

```
Gson gson = new Gson();
```

* conversão do json para uma entidade atraves da lib gson
		
```
brasilApi = gson.fromJson(response.body(), BrasilApi.class);
```









