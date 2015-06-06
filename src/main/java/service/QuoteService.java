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

	private static final int max = 20;
	private static final int min = 1;
	private static final int range = max - min + 1;
	private static final ConcurrentHashMap<Integer, Quote> quotesCache = new ConcurrentHashMap<>();
	private static final Quote errorQuote = new Quote(0, "You poor child, you broke this web site. Pray for new quotes!", "RandowQuote Admin - yah, that's a real name!");
	
	static {
		
		quotesCache.put(1, new Quote(1, "\"For instance, on the planet Earth, man had always assumed that he was more intelligent than dolphins because he had achieved so much—the wheel, New York, wars and so on—whilst all the dolphins had ever done was muck about in the water having a good time. But conversely, the dolphins had always believed that they were far more intelligent than man—for precisely the same reasons.\"", "Douglas Adams"));
		quotesCache.put(2, new Quote(2, "\"Don't Panic.\"", "Douglas Adams"));
		quotesCache.put(3, new Quote(3, "\"Time is an illusion. Lunchtime doubly so.\"", "Douglas Adams"));
		quotesCache.put(4, new Quote(4, "\"Space is big. You just won't believe how vastly, hugely, mind-bogglingly big it is. I mean, you may think it's a long way down the road to the chemist's, but that's just peanuts to space.\"", "Douglas Adams"));
		quotesCache.put(5, new Quote(5, "\"I'd far rather be happy than right any day.\"", "Douglas Adams"));
		quotesCache.put(6, new Quote(6, "\"This must be Thursday,' said Arthur to himself, sinking low over his beer. 'I never could get the hang of Thursdays.\"", "Douglas Adams"));
		quotesCache.put(7, new Quote(7, "\"I really wish I'd listened to what my mother told me when I was young.\"<br>" +
											"\"Why, what did she tell you?\"<br>" + "\"I don't know, I didn't listen.\"", "Ford and Arthur - Douglas Adams"));
		quotesCache.put(8, new Quote(8, "\"If you ain’t first, you’re last!\"", "Ricky Bobby"));
		quotesCache.put(9, new Quote(9, "\"I’ve sent in my application to the real world. So I’m hoping to hear back from that. I’m putting a lot of my eggs into that basket, the MTV basket. I’m also thinking about getting a gun and dealing crack. Being a crack dealer, not like a mean crack dealer, but like… like a nice one. Kinda friendly like, “hey, what’s up guys? Want some crack?” I’m just waiting on those two things to flesh themselves out.\"", "Ricky Bobby"));
		quotesCache.put(10, new Quote(10, "\"Oh hell, son, I was high that day. That doesn’t make any sense at all, you can be second, you can be third, you can be fourth… hell you can even be fifth\"", "Reese Bobby"));
		quotesCache.put(11, new Quote(11, "\"Anyway, like I was sayin’, shrimp is the fruit of the sea. You can barbecue it, boil it, broil it, bake it, saute it. There’s shrimp-kabobs, shrimp creole, shrimp gumbo. Pan fried, deep fried, stir-fried. There’s pineapple shrimp, lemon shrimp, coconut shrimp, pepper shrimp, shrimp soup, shrimp stew, shrimp salad, shrimp and potatoes, shrimp burger, shrimp sandwich. That, that’s about it.\"", "Bubba"));
		quotesCache.put(12, new Quote(12, "\"What did she say?\"<br>\"She hit me on the head with the rock again.\"<br>"
				+ "\"I think I can confirm that that was my daughter.\"<br>\"Sweet kid.\"<br>\"You have to get to know her,\" "
				+ "said Arthur.<br>\"She eases up, does she?\"<br>\"No, said Arthur, \"but you get a better sense of when to duck.\"", "Ford and Arthur - Douglas Adams"));
		quotesCache.put(13, new Quote(13, "\"If you ain’t first, you’re last!\"", "Ricky Bobby"));
		quotesCache.put(14, new Quote(14, "\"Protect me from knowing what I don't need to know. Protect me from even knowing that there are things to know that I don't know. Protect me from knowing that I decided not to know about the things that I decided not to know about. Amen.\"", "Douglas Adams"));
		quotesCache.put(15, new Quote(15, "\"Dear Lord, before we eat this meal we ask forgiveness for our sins, especially Boyd- who blew up a black church with a rocket launcher, and afterwards he shot his associate Jared Hale in the back of the head out on Tate's Creek bridge. Let the image of Jared's brain matter on that windshield not dampen our appetites, but may the knowledge of Boyd's past sins help guide these men. May this food provide them with all the nourishment they need. But, if it does not, may they find comfort in knowing that the United States Marshal Service is offering fifty-thousand dollars to any individual providing information that will put Boyd back in prison. Cash or check, we can make it out to them. Or to Jesus. Whoever they want. In your name, we pray. Amen.\"", "Raylan Givens"));
		quotesCache.put(16, new Quote(16, "\"I tell you to do one simple thing - refrain from screwing the witness in your own shooting - and you can't even do that!\"", "Art Mullen"));
		quotesCache.put(17, new Quote(17, "\"Hey, if I was you, I'd give up this Nazi bullshit. Go back to poaching gators. It's safer.\"", "Raylan Givens to Dewey Crowe"));
		quotesCache.put(18, new Quote(18, "\"Got to ask. Why the hat?\"<br>\"Honestly? I tried it on one time, and it fit.\"", "Rachel Brooks - Raylan Givens"));
		quotesCache.put(19, new Quote(19, "\"Miami is a sunny place for shady people.\"", "Raylan Givens"));
		quotesCache.put(20, new Quote(20, "\"In the beginning the Universe was created. This has made a lot of people very angry and been widely regarded as a bad move.\"", "Douglas Adams"));
	}
}
