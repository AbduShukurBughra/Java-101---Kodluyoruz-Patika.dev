import java.util.Scanner;

public class Burcu {
    public static void main(String[] args) {
        int month, day;
        String burcu = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Dogdunuz ay : ");
        month = input.nextInt();

        System.out.println("Dogdunuz gun : ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burcu = "Oglak";
                    } else {
                        burcu = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burcu = "Kova";
                    } else {
                        burcu = "Balik";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        burcu = "Balik";
                    } else {
                        burcu = "koc";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        burcu = "Koc";
                    } else {
                        burcu = "Boga";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burcu = "Boga";
                    } else {
                        burcu = "ikizler";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burcu = "ikizler";
                    } else {
                        burcu = "Yengec";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burcu = "Yengec";
                    } else {
                        burcu = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burcu = "Aslan";
                    } else {
                        burcu = "Basak";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burcu = "Basak";
                    } else {
                        burcu = "Tersazi";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burcu = "Terazi";
                    } else {
                        burcu = "Akrep";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burcu = "Akrep";
                    } else {
                        burcu = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        burcu = "Yay";
                    } else {
                        burcu = "Oglak";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        if (isError) {
            System.out.println("Hatali giris yaptiniz: ");
        } else {
            System.out.println("Burcunuz : " + burcu);
        }
    }
}
