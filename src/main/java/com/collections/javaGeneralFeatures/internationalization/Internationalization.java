package com.collections.javaGeneralFeatures.internationalization;
import java.util.*;

       /** Internationalization is also abbreviated as I18N because there are total 18 characters between the first letter 'I' and the last letter 'N'.

        Internationalization is a mechanism to create such an application that can be adapted to different languages and regions.

        Internationalization is one of the powerful concept of java if you are developing an application and want to display messages,
        currencies, date, time etc. according to the specific region or language.

        Localization is also abbreviated as I10N because there are total 10 characters between the first letter 'L' and last letter 'N'.
        Localization is the mechanism to create such an application that can be adapted to a specific language and region by adding locale-specific text and component.*/

public class Internationalization {

    /**    Example of Local class that prints the informations of the default locale
           If you want to get the informations about any specific locale,
           comment the first line statement and uncomment the second line statement in the main method.*/


               public static void main(String[] args) {

                   Locale locale=Locale.getDefault();
                   System.out.println(locale.getDisplayCountry());
                   System.out.println(locale.getDisplayLanguage());
                   System.out.println(locale.getDisplayName());
                   System.out.println(locale.getISO3Country());
                   System.out.println(locale.getISO3Language());
                   System.out.println(locale.getLanguage());
                   System.out.println(locale.getCountry());

                   Locale locale2= new Locale("fr","fr");//for the specific locale
                   System.out.println(locale2.getDisplayCountry());
                   System.out.println(locale2.getDisplayLanguage());
                   System.out.println(locale2.getDisplayName());
                   System.out.println(locale2.getISO3Country());
                   System.out.println(locale2.getISO3Language());
                   System.out.println(locale2.getLanguage());
                   System.out.println(locale2.getCountry());

               }
           }

