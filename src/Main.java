import java.util.LinkedHashMap;
import java.util.Scanner;

abstract class Car{
    abstract void BasicServicing(String ServiceCode, String CarType);
    abstract void EngineFixing(String ServiceCode, String CarType);
    abstract void ClutchFixing(String ServiceCode, String CarType);
    abstract void BrakeFixing(String ServiceCode, String CarType);
    abstract void GearFixing(String ServiceCode, String CarType);

        }

        class Service extends Car{

            long rupees=0;

            @Override
            void BasicServicing(String ServiceCode, String CarType) {
                if(ServiceCode.equals("BS01") && CarType.equals("Hatchback")){
                    rupees+=2000;
                }else if(ServiceCode.equals("BS01") && CarType.equals("Sedan")){
                    rupees+=4000;
                }else if(ServiceCode.equals("BS01") && CarType.equals("SUV")){
                    rupees+=5000;
                }
            }

            @Override
            void EngineFixing(String ServiceCode, String CarType) {
                if(ServiceCode.equals("EF01") && CarType.equals("Hatchback")){
                    rupees+=5000;
                }else if(ServiceCode.equals("EF01") && CarType.equals("Sedan")){
                    rupees+=8000;
                }else if(ServiceCode.equals("EF01") && CarType.equals("SUV")){
                    rupees+=10000;
                }
            }

            @Override
            void ClutchFixing(String ServiceCode, String CarType) {
                if(ServiceCode.equals("EF01") && CarType.equals("Hatchback")){
                    rupees+=2000;
                }else if(ServiceCode.equals("EF01") && CarType.equals("Sedan")){
                    rupees+=4000;
                }else if(ServiceCode.equals("EF01") && CarType.equals("SUV")){
                    rupees+=6000;
                }
            }

            @Override
            void BrakeFixing(String ServiceCode, String CarType) {
                if(ServiceCode.equals("BF01") && CarType.equals("Hatchback")){
                    rupees+=1000;
                }else if(ServiceCode.equals("BF01") && CarType.equals("Sedan")){
                    rupees+=1500;
                }else if(ServiceCode.equals("BF01") && CarType.equals("SUV")){
                    rupees+=2500;
                }
            }

            @Override
            void GearFixing(String ServiceCode, String CarType) {
                if(ServiceCode.equals("GF01") && CarType.equals("Hatchback")){
                    rupees+=3000;
                }else if(ServiceCode.equals("GF01") && CarType.equals("Sedan")){
                    rupees+=6000;
                }else if(ServiceCode.equals("GF01") && CarType.equals("SUV")){
                    rupees+=8000;
                }
            }


            public void prices(){
                if(rupees>10000){
                    System.out.println("complimentary cleaning");
                }else{
                    System.out.println(rupees);
                }
            }
        }
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Service serviceObj = new Service();

        System.out.println("Service Code : "+"BS01 EF01 CF01 BF01 GF01");
        System.out.println("carType : "+"BasicServicing EngineFixing ClutchFixing BrakeFixing GearFixing");
        System.out.println("Service : "+"BS01 for BasicServicing , EF01 for EngineFixing , CF01 for ClutchFixing , BF01 for BrakeFixing , GF01 for GearFixing");
        System.out.println("and 0r paly : "+"ans for more insertion AND play for Display price:-");


        while(sc.hasNext()){
            String Code = sc.next();
            System.out.println("Enter carType: ");
            String carTyp = sc.next();
            System.out.println("Enter service: ");
            String service = sc.next();
            System.out.println("Enter and OR play: ");
            String print= sc.next();
            if(service.equals("BasicServicing")){
                serviceObj.BasicServicing(Code, carTyp);
            }else if(service.equals("EngineFixing")) {
                serviceObj.EngineFixing(Code, carTyp);
            }else if(service.equals("ClutchFixing")) {
                serviceObj.ClutchFixing(Code, carTyp);
            }else if(service.equals("BrakeFixing")) {
                serviceObj.BrakeFixing(Code, carTyp);
            }else if(service.equals("GearFixing")){
                serviceObj.GearFixing(Code, carTyp);

            }
            if(print.equals("play")){
                serviceObj.prices();
            }
        }

    }
}