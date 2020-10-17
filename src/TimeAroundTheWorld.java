public class TimeAroundTheWorld {

    public static void main(String[] args) {

        System.out.println(timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra"));

    }

    public static String timeDifference(String cityA, String timestamp, String cityB) {
        timestamp = timestamp.replaceAll(",", "");
        String[] tsSplit = timestamp.split(" ");

        int day = Integer.parseInt(tsSplit[1]);
        int month = 0;
        int year = Integer.parseInt(tsSplit[2]);;
        int hours = Integer.parseInt(tsSplit[3].substring(0, 2));
        int minutes = Integer.parseInt(tsSplit[3].substring(3));
        int temp = 0;
        String strDay = "";
        String strMonth = "";
        String strYear = "";
        String strHours = "";
        String strMinutes = "";

        switch (tsSplit[0]) {
            case "January":
                month = 1;
                break;
            case "February":
                month = 2;
                break;
            case "March":
                month = 3;
                break;
            case "April":
                month = 4;
                break;
            case "May":
                month = 5;
                break;
            case "June":
                month = 6;
                break;
            case "July":
                month = 7;
                break;
            case "August":
                month = 8;
                break;
            case "September":
                month = 9;
                break;
            case "October":
                month = 10;
                break;
            case "November":
                month = 11;
                break;
            case "December":
                month = 12;
                break;
            default:
                break;
        }

        String[] cities = {cityA, cityB};
        int minutes1 = 0;
        int hours1 = 0;
        int minutes2 = 0;
        int hours2 = 0;

        for(int i = 0; i < cities.length; i++) {

            switch (cities[i]) {
                case "Los Angeles":
                    minutes2 = 0;
                    hours2 = 0;
                    break;
                case "New York":
                    minutes2 = 0;
                    hours2 = 3;
                    break;
                case "Caracas":
                    minutes2 = 30;
                    hours2 = 3;
                    break;
                case "Buenos Aires":
                    minutes2 = 0;
                    hours2 = 5;
                    break;
                case "London":
                    minutes2 = 0;
                    hours2 = 8;
                    break;
                case "Rome":
                    minutes2 = 0;
                    hours2 = 9;
                    break;
                case "Moscow":
                    minutes2 = 0;
                    hours2 = 11;
                    break;
                case "Tehran":
                    minutes2 = 30;
                    hours2 = 11;
                    break;
                case "New Delhi":
                    minutes2 = 30;
                    hours2 = 13;
                    break;
                case "Beijing":
                    minutes2 = 0;
                    hours2 = 16;
                    break;
                case "Canberra":
                    minutes2 = 0;
                    hours2 = 18;
                    break;
            }

            if(i == 1) {
                break;
            }

            minutes1 = minutes2;
            hours1 = hours2;
        }

        int tempMinutes = minutes + (minutes2 - minutes1);


        if(tempMinutes >= 0 && tempMinutes < 60) {
          minutes = tempMinutes;
            temp = 0;

        } else if(tempMinutes < 0) {
            minutes = 60 + tempMinutes;
            temp = -1;

        } else {
            minutes = tempMinutes % 60;
            temp = 1;
        }

        if(minutes < 10) {
            strMinutes = "0" + minutes;
        } else {
            strMinutes = Integer.toString(minutes);
        }


        int tempHours = hours + (hours2 - hours1) + temp;

        if(tempHours >= 0 && tempHours < 24) {
            hours = tempHours;
            temp = 0;

        } else if(tempHours < 0) {
            hours = 24 + tempHours;
            temp = -1;

        } else {
            hours = tempHours % 24;
            temp = 1;
        }

        if(hours < 10) {
            strHours = "0" + hours;
        } else {
            strHours = Integer.toString(hours);
        }


        int tempDay = day + temp;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(tempDay >= 1 && tempDay <= 31) {
                    day = tempDay;
                    temp = 0;

                } else if(tempDay < 1) {
                    day = 31 + tempDay;
                    temp = -1;

                } else {
                    day = tempDay % 31;
                    temp = 1;
                }
                break;
            case 2:
                if(tempDay >= 1 && tempDay <= 28) {
                    day = tempDay;
                    temp = 0;

                } else if(tempDay < 1) {
                    day = 28 + tempDay;
                    temp = -1;

                } else {
                    day = tempDay % 28;
                    temp = 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(tempDay >= 1 && tempDay <= 30) {
                    day = tempDay;
                    temp = 0;

                } else if(tempDay < 1) {
                    day = 30 + tempDay;
                    temp = -1;

                } else {
                    day = tempDay % 30;
                    temp = 1;
                }
                break;
            default:
                break;
        }

        strDay = Integer.toString(day);

        int tempMonth = month + temp;

        if(tempMonth >= 1 && tempMonth <= 12) {
            month = tempMonth;
            temp = 0;

        } else if(tempMonth < 1) {
            month = 12 + (tempMonth);
            temp = 1;

        } else {
            month = tempMonth % 12;
            temp = 1;
        }

        strMonth = Integer.toString(month);

        year = year + temp;

        strYear = Integer.toString(year);

        return strYear + "-" + strMonth + "-" + strDay + " " + strHours + ":" + strMinutes;
    }
}
