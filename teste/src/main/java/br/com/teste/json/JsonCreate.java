package br.com.teste.json;

public class JsonCreate {
	
	public String generate(String nome,int codigo, String categoria,
			int preco){
		String jsonString = null;
		
		JsonObject json = new JsonObject();
		
		json =  json.createObjectBuilder()
				.add("nome",nome)
				.add("codigo",codigo)
				.add("categoria",categoria)
				.add("preco",preco)
				.build();
		
		jsonString = json.toString();
	
		return jsonString;
	}

}
