package gru.springframework.joke.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


@Service
public class JokeServiceImpl  implements JokeService{
	
	

	private  ChuckNorrisQuotes chucknorrisquotes;
	


	public JokeServiceImpl() {
		super();
		this.chucknorrisquotes=new ChuckNorrisQuotes();
	}



	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return chucknorrisquotes.getRandomQuote();
	}

}
