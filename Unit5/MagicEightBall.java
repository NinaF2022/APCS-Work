public class MagicEightBall
{
  String responce1 = "It is certain";
  String responce2 = "It is decidedly so";
  String responce3 = "Without a doubt";
  String responce4 = "Yes definitely";
  String responce5 = "You may rely on it";
  String responce6 = "As I see it, yes";
  String responce7 = "Most likely";
  String responce8 = "Outlook good";
  String responce9 = "Yes";
  String responce10 = "Signs point to yes";
  String responce11 = "Return ply hazy, try again";
  String responce12 = "Ask again later";
  String responce13 = "Better not tell you now";
  String responce14 = "Cannot predict now";
  String responce15 = "Concentrate and ask again";
  String responce16 = "Don't count on it";
  String responce17 = "My reply is no";
  String responce18 = "My sources say no";
  String responce19 = "Outlook not so good";
  String responce20 = "Very doubtful";

  public String roll()
  {
    double result = Math.random();

    if (result < 0.05)
      return responce1;
    else if (result < .1)
      return responce2;
    else if (result < .15)
      return responce3;
    else if (result < .2)
      return responce4;
    else if (result < .25)
      return responce5;
    else if (result < .3)
      return responce6;
    else if (result < .35)
      return responce7;
    else if (result < .4)
      return responce8;
    else if (result < .45)
      return responce9;
    else if (result < .5)
      return responce10;
    else if (result < .55)
      return responce11;
    else if (result < .6)
      return responce12;
    else if (result < .65)
      return responce13;
    else if (result < .7)
      return responce14;
    else if (result < .75)
      return responce15;
    else if (result < .8)
      return responce16;
    else if (result < .85)
      return responce17;
    else if (result < .9)
      return responce18;
    else if (result < .95)
      return responce19;
    else if (result < 1)
      return responce20;

    return "something";
  }

}
