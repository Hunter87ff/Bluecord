package mods.utils.translate;

import mods.view.SpinnerMap;

public final class LanguageHolder {

    private static final SpinnerMap choices;

    static {
        /*try {
            choices.put("[Default] " + Locale.getDefault().getDisplayLanguage(), Locale.getDefault().getCountry());
        } catch (Exception e) {
            e.printStackTrace();
        }
         */
        /*choices.put("English", "en");
        choices.put("Spanish", "es");
        choices.put("Arabic", "ar");
        choices.put("Chinese", "zh");
        choices.put("French", "fr");
        choices.put("German", "de");
        choices.put("Hindi", "hi");
        choices.put("Irish", "ga");
        choices.put("Italian", "it");
        choices.put("Japanese", "ja");
        choices.put("Korean", "ko");
        choices.put("Portuguese", "pt");
        choices.put("Russian", "ru");*/

        choices = new SpinnerMap(120);
        choices.put("English", "en");
        choices.put("Spanish", "es");
        choices.put("Afrikaans", "af");
        choices.put("Albanian", "sq");
        choices.put("Amharic", "am");
        choices.put("Arabic", "ar");
        choices.put("Armenian", "hy");
        choices.put("Azerbaijani", "az");
        choices.put("Basque (family)", "eu");
        choices.put("Belarusian", "be");
        choices.put("Bengali", "bn");
        choices.put("Bosnian", "bs");
        choices.put("Bulgarian", "bg");
        choices.put("Burmese", "my");
        choices.put("Catalan", "ca");
        choices.put("Central Khmer", "km");
        choices.put("Chinese", "zh");
        choices.put("Corsican", "co");
        choices.put("Croatian", "hr");
        choices.put("Czech", "cs");
        choices.put("Danish", "da");
        choices.put("Dutch", "nl");
        choices.put("Esperanto", "eo");
        choices.put("Estonian", "et");
        choices.put("Finnish", "fi");
        choices.put("French", "fr");
        choices.put("Galician", "gl");
        choices.put("Georgian", "ka");
        choices.put("German", "de");
        choices.put("Gujarati", "gu");
        choices.put("Haitian", "ht");
        choices.put("Hausa", "ha");
        choices.put("Hebrew", "iw");
        choices.put("Hindi", "hi");
        choices.put("Hungarian", "hu");
        choices.put("Icelandic", "is");
        choices.put("Igbo", "ig");
        choices.put("Indonesian", "id");
        choices.put("Irish", "ga");
        choices.put("Italian", "it");
        choices.put("Japanese", "ja");
        choices.put("Kannada", "kn");
        choices.put("Kazakh", "kk");
        choices.put("Kinyarwanda", "rw");
        choices.put("Kirghiz", "ky");
        choices.put("Korean", "ko");
        choices.put("Kurdish", "ku");
        choices.put("Lao", "lo");
        choices.put("Latin", "la");
        choices.put("Latvian", "lv");
        choices.put("Lithuanian", "lt");
        choices.put("Luxembourgish", "lb");
        choices.put("Maori", "mi");
        choices.put("Macedonian", "mk");
        choices.put("Malagasy", "mg");
        choices.put("Malay", "ms");
        choices.put("Malayalam", "ml");
        choices.put("Maltese", "mt");
        choices.put("Marathi", "mr");
        choices.put("Modern Greek", "el");
        choices.put("Mongolian", "mn");
        choices.put("Nepali", "ne");
        choices.put("Norwegian", "no");
        choices.put("Nyanja", "ny");
        choices.put("Oriya", "or");
        choices.put("Panjabi", "pa");
        choices.put("Persian", "fa");
        choices.put("Polish", "pl");
        choices.put("Portuguese", "pt");
        choices.put("Pushto", "ps");
        choices.put("Romanian", "ro");
        choices.put("Russian", "ru");
        choices.put("Samoan", "sm");
        choices.put("Scottish Gaelic", "gd");
        choices.put("Serbian", "sr");
        choices.put("Shona", "sn");
        choices.put("Sindhi", "sd");
        choices.put("Sinhala", "si");
        choices.put("Slovak", "sk");
        choices.put("Slovene", "sl");
        choices.put("Somali", "so");
        choices.put("Southern Sotho", "st");
        choices.put("Sundanese", "su");
        choices.put("Swahili", "sw");
        choices.put("Swedish", "sv");
        choices.put("Tagalog", "tl");
        choices.put("Tajik", "tg");
        choices.put("Tamil", "ta");
        choices.put("Tatar", "tt");
        choices.put("Telugu", "te");
        choices.put("Thai", "th");
        choices.put("Turkish", "tr");
        choices.put("Turkmen", "tk");
        choices.put("Uighur", "ug");
        choices.put("Ukrainian", "uk");
        choices.put("Urdu", "ur");
        choices.put("Uzbek", "uz");
        choices.put("Vietnamese", "vi");
        choices.put("Welsh", "cy");
        choices.put("West Frisian", "fy");
        choices.put("Xhosa", "xh");
        choices.put("Yiddish", "yi");
        choices.put("Yoruba", "yo");
        choices.put("Zulu", "zu");
    }

    public static SpinnerMap getLangs() {
        return choices;
    }
}
