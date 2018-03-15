package edu.knoldus;

public class Application {

  public static void main(String[] args) {

    TwitterOperation obj = new TwitterOperation();

    // Q1
    obj.getLatestPost().thenAccept(System.out::println);

    // Q2
    obj.getOldToNewTweets().thenAccept(System.out::println);

    // Q3
    obj.higherToLowerReTweetsCount().thenAccept(System.out::println);

    // Q4
    obj.higherToLowerLikesCount().thenAccept(System.out::println);

    // Q5
    obj.getTweets("2018-03-14").thenAccept(System.out::println);

    try {
      Thread.sleep(20000);
    } catch (InterruptedException exception) {
      exception.printStackTrace();
    }
  }

}
