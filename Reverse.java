// This program manipulates a fixed string to reverse it, replace characters in it (in this case '<' with 'e'),
// find the number of quotation marks, and find the number of instances of the word "Nevermore."

class Reverse {
  public static String reverseString(String text) {
    String reverseText = "";

    for (int i = 0; i < text.length(); i++){
      reverseText = text.charAt(i) + reverseText;
    }

    return reverseText;
   
  }

  public static String replaceCharacter(String text, char charToReplace, char replacement) {
    String fixedText = "";
    int i_checkpoint = 0;

    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) != charToReplace) {
            continue;
        }
        else {
            fixedText = fixedText + text.substring(i_checkpoint, i);
            fixedText = fixedText + replacement;
            i_checkpoint = i + 1;
        }
    }

    return fixedText;

  }

  public static float findNumberOfQuotes(String text) {
    float counter = 0;

    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == '"') {
            counter += 1;
        }
    }

    counter /= 2;

    return counter;

  }

  public static int findNumValues(String text, String textToFind) {
    int counter = 0;
    int i = 0;

    while (i <= text.length() - textToFind.length()) {
        if (text.substring(i, i + textToFind.length()).equalsIgnoreCase(textToFind)) {
            counter += 1;
        }

        i++;

    }

    return counter;

  }

  public static void main(String[] args) {
    String text = new String("\".<romr<v<N\" sa <man hcus htiW\n ,rood r<bmahc sih <voba tsub d<rutplucs <ht nopu tsa<b ro driB —rood r<bmahc sih <voba drib gni<<s htiw d<ss<lb saw t<y r<v< gni<b namuh gnivil on taht gni<<rga pl<h tonnac <w roF ;<rob ycnav<l<r <lttil—gnina<m <lttil r<wsna sti hguohT ,ylnialp os <sruocsid ra<h ot lwof ylniagnu siht d<ll<vram I hcuM\n\n\".<romr<v<N\" n<vaR <ht htouQ\n \"!<rohs nainotulP s’thgiN <ht no si <man yldrol yht tahw <m ll<T —<rohs ylthgiN <ht morf gnir<dnaw n<vaR tn<icna dna mirg yltsahG ,n<varc on <rus tra\" ,dias I \",uoht ,n<vahs dna nrohs <b ts<rc yht hguohT\",<row ti <cnan<tnuoc <ht fo muroc<d nr<ts dna <varg <ht yB ,gnilims otni ycnaf das ym gniliug<b drib ynob< siht n<hT");

    String fixedText = reverseString(text);
    fixedText = replaceCharacter(fixedText, '<', 'e');
    System.out.println(findNumberOfQuotes(fixedText));
    System.out.println(findNumValues(fixedText, "Nevermore"));
   
 }
}