package service;
import java.util.concurrent.ConcurrentHashMap;

import model.Quote;


public class QuoteService {
	
	public static final Quote getRandomQuote() {
		
		int randomQuoteIndex = (int)(Math.random() * range) + 1;
		//System.out.println("randomQuoteIndex: " + randomQuoteIndex);
		
		Quote randomQuoteInCache = quotesCache.get(randomQuoteIndex);
		
		if(randomQuoteInCache != null) {
			//System.out.println("From cache");
			return randomQuoteInCache;
		}
		
		Quote quoteFromDB = getQuoteFromDB(randomQuoteIndex);
		
		if(quoteFromDB == null) {
			return errorQuote;
		}
		
		quotesCache.put(randomQuoteIndex, quoteFromDB);
		
		return quoteFromDB;
	}
	
	private static Quote getQuoteFromDB(int randomQuoteIndex) {

		//System.out.println("DB ID: " + randomQuoteIndex);
		return new Quote(randomQuoteIndex, "If you ain't first, you last." + randomQuoteIndex, "Ricky Bobby");
	}

	private static final int max = 11;
	private static final int min = 1;
	private static final int range = max - min + 1;
	private static final ConcurrentHashMap<Integer, Quote> quotesCache = new ConcurrentHashMap<>();
	private static final Quote errorQuote = new Quote(0, "You poor child, you broke this web site. Pray for new quotes!", "RandowQuote Admin - yah, that's a real name!");
	
	static {
		
		quotesCache.put(1, new Quote(1, "For instance, on the planet Earth, man had always assumed that he was more intelligent than dolphins because he had achieved so much—the wheel, New York, wars and so on—whilst all the dolphins had ever done was muck about in the water having a good time. But conversely, the dolphins had always believed that they were far more intelligent than man—for precisely the same reasons.", "Douglas Adams"));
		quotesCache.put(2, new Quote(2, "Don't Panic.", "Douglas Adams"));
		quotesCache.put(3, new Quote(3, "Time is an illusion. Lunchtime doubly so.", "Douglas Adams"));
		quotesCache.put(4, new Quote(4, "Space is big. You just won't believe how vastly, hugely, mind-bogglingly big it is. I mean, you may think it's a long way down the road to the chemist's, but that's just peanuts to space.", "Douglas Adams"));
		quotesCache.put(5, new Quote(5, "I'd far rather be happy than right any day.", "Douglas Adams"));
		quotesCache.put(6, new Quote(6, "This must be Thursday,' said Arthur to himself, sinking low over his beer. 'I never could get the hang of Thursdays.", "Douglas Adams"));
		quotesCache.put(7, new Quote(7, "\"I really wish I'd listened to what my mother told me when I was young.\"\n" +
											"\"Why, what did she tell you?\"\n" + "\"I don't know, I didn't listen.\"", "Douglas Adams"));
		quotesCache.put(8, new Quote(8, "If you ain’t first, you’re last!", "Ricky Bobby"));
		quotesCache.put(9, new Quote(9, "I’ve sent in my application to the real rorld. So I’m hoping to hear back from that. I’m putting a lot of my eggs into that basket, the MTV basket. I’m also thinking about getting a gun and dealing crack. Being a crack dealer, not like a mean crack dealer, but like… like a nice one. Kinda friendly like, “hey, what’s up guys? Want some crack?” I’m just waiting on those two things to flesh themselves out.", "Ricky Bobby"));
		quotesCache.put(10, new Quote(10, "Oh hell, son, I was high that day. That doesn’t make any sense at all, you can be second, you can be third, you can be fourth… hell you can even be fifth", "Reese Bobby"));
		quotesCache.put(11, new Quote(11, "Anyway, like I was sayin’, shrimp is the fruit of the sea. You can barbecue it, boil it, broil it, bake it, saute it. There’s shrimp-kabobs, shrimp creole, shrimp gumbo. Pan fried, deep fried, stir-fried. There’s pineapple shrimp, lemon shrimp, coconut shrimp, pepper shrimp, shrimp soup, shrimp stew, shrimp salad, shrimp and potatoes, shrimp burger, shrimp sandwich. That, that’s about it.", "Bubba"));
	}
}
