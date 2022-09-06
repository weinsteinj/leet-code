public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if(walk.length != 10) {
      return false;
    }
    int northBias = 0;
    int westBias = 0;
    for(char dirChar : walk) {
      switch (dirChar) {
        case 'n': northBias += 1;
          break;
        case 's': northBias -= 1;
          break;
        case 'w': westBias += 1;
          break;
        case 'e': westBias -= 1;
          break;
          }
    }
    if (northBias != 0 || westBias != 0) {
      return false;
    }
    return true;
  }
}