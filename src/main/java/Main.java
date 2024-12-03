public class Main {
    public static void main(String[] args) {
        ApiFacade apiFacade = new ApiFacade();

        String jokeApiUrl = "https://api.chucknorris.io/jokes/random";
        String jokeAttribute = "value";

        try {
            String joke = apiFacade.getAttributeValueFromJson(jokeApiUrl, jokeAttribute);
            System.out.println("Chuck Norris Joke: " + joke);
        } catch (Exception e) {
            System.err.println("Failed to retrieve joke: " + e.getMessage());
        }

        String forexApiUrl = "https://api.fxratesapi.com/latest";
        String forexAttribute = "base";

        try {
            String baseCurrency = apiFacade.getAttributeValueFromJson(forexApiUrl, forexAttribute);
            System.out.println("Base Currency: " + baseCurrency);
        } catch (Exception e) {
            System.err.println("Failed to retrieve forex data: " + e.getMessage());
        }
    }
}
