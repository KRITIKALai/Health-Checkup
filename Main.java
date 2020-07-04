package SecondPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Jerry";
        int age = 47;
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        Scanner scanner = new Scanner(System.in);
        int organChoosen = 0;

        do{
            System.out.println("Choose an Organ:");
            System.out.println("\t1.Left Eye");
            System.out.println("\t2.Right Eye");
            System.out.println("\t3.Heart");
            System.out.println("\t4.Stomach");
            System.out.println("\t5.Skin");
            System.out.println("\t6.Quit");
            organChoosen = scanner.nextInt();
            if(organChoosen == 1){
                leftEye le = new leftEye("Left Eye", "Normal");
                le.setColor("Brown");
                System.out.println("Name: "+ le.getName());
                System.out.println("Medical Condition"+ le.getMedicalCondition());
                System.out.println("Color: "+ le.getColor());
                System.out.println("\t1. Close the eye");
                int closeEye = scanner.nextInt();
            }
            else if(organChoosen == 2){
                rightEye re = new rightEye("Right Eye", "Normal");
                re.setColor("Brown");
                System.out.println("Name: "+ re.getName());
                System.out.println("Medical Condition"+ re.getMedicalCondition());
                System.out.println("Color: "+ re.getColor());
                System.out.println("\t1. Close the eye");
                int closeEye = scanner.nextInt();
            }
            else if(organChoosen == 3){
                Heart ht = new Heart("Heart", "Normal",75);
                System.out.println("Name: "+ ht.getName());
                System.out.println("Medical Condition"+ ht.getMedicalCondition());
                ht.setHeartRate(75);
                System.out.println("Heart Rate: "+ ht.getHeartRate());
                System.out.println("\t1. Change heart rate");
                int changeHeartRate = scanner.nextInt();
                if (changeHeartRate == 1){
                    System.out.println("Enter new heart rate: ");
                    int newHeartRate = scanner.nextInt();
                    ht.setHeartRate(newHeartRate);
                    System.out.println("Heart Rate changed to "+ ht.getHeartRate());
                }
            }
            else if(organChoosen == 4){
                Stomach stm = new Stomach("Stomach", "PUD");
                System.out.println("Name: "+ stm.getName());
                System.out.println("Medical Condition"+ stm.getMedicalCondition());
                System.out.println("Need to be fed");
                System.out.println("\t1.Digest");
                int toDigest = scanner.nextInt();
                if(toDigest == 1){
                    System.out.println("Digesting..");
                    stm.setMedicalCondition("Normal");
                }

            }
            else if(organChoosen == 5){
                Skin sk = new Skin("Skin", "Burned");
                System.out.println("Name: "+ sk.getName());
                System.out.println("Medical Condition: "+ sk.getMedicalCondition());
            }
        }while(organChoosen != 6);

    }

}
