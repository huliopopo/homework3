public class Main {
    public static void main(String[] args) {
        //Задача 1
        int i = 50000;
        byte b = 127;
        short sh = 32767;
        long l = 30000000L;
        float f = 1.5f;
        double d = 10.11;
        System.out.println("Значение переменной i с типом int равно "+i);
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной sh с типом short равно "+sh);
        System.out.println("Значение переменной l с типом long равно "+l);
        System.out.println("Значение переменной f с типом float равно "+f);
        System.out.println("Значение переменной d с типом double равно "+d);
        //Задача 2
        float A = 27.12f;
        long B = 987678965549L;
        double C = 2.786;
        int D = 569;
        int E = -159;
        short F = 27897;
        byte G = 67;
        //Задача 3
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short allSheets = 480;
        int studentsAll = studentsAS + studentsEA + studentsLP;
        int sheetsPerStudent = allSheets / studentsAll;
        System.out.println("На каждого ученика рассчитано "+sheetsPerStudent+" листов бумаги");
        //Задача 4
        byte machineProductivity = 16;
        byte machineTime = 2;
        int machineProdByMinute = machineProductivity / machineTime;
        System.out.println("За 20 минут машина произвела "+machineProdByMinute*20+" штук бутылок");
        System.out.println("За сутки машина произвела "+machineProdByMinute*60*24+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+machineProdByMinute*60*24*3+" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+machineProdByMinute*60*24*3*30+" штук бутылок");
        //Задача 5
        byte totalTin = 120;
        byte whiteTinPerClass = 2;
        byte brownTinPerClass = 4;
        int classes = totalTin / (whiteTinPerClass + brownTinPerClass);
        int totalWhiteTin = classes * whiteTinPerClass;
        int totalBrownTin = classes * brownTinPerClass;
        System.out.println("В школе, где "+classes+" классов, нужно "+totalWhiteTin+" банок белой краски и "
                +totalBrownTin+ " банок коричневой краски");
        //Задача 6
        short bananaWeight = 80;
        short milkWeight = 105;
        short iceCreamWeight = 100;
        short eggWeight = 70;
        int bananas = 5;
        int milk = 2;
        int iceCream = 2;
        int egg = 4;
        int totalWeightG = bananaWeight*bananas+milkWeight*milk+iceCreamWeight*iceCream+eggWeight*egg;
        int grPerKg = 1000;
        float totalWeightKg = totalWeightG / (float)grPerKg;
        System.out.println("Общий вес составляет "+totalWeightG+" грамм или "+totalWeightKg+" килограмм");
        //Задача 7
        short goalGr = 7000;
        short minGr = 250;
        short maxGr = 500;
        int daysWithMinGr = goalGr / minGr;
        int daysWithMaxGr = goalGr / maxGr;
        int daysAverage = (daysWithMinGr - daysWithMaxGr) / 2 + daysWithMaxGr;
        System.out.println("Минимум дней - "+daysWithMaxGr);
        System.out.println("Максимум дней - "+daysWithMinGr);
        System.out.println("В среднем дней - "+daysAverage);
        //Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76320;
        int annualIncomeMasha = salaryMasha * 12;
        int annualIncomeDenis = salaryDenis * 12;
        int annualIncomeKristina = salaryKristina * 12;
        //float salaryRise = 1.1f;
        int salaryRiseMasha = (int) (salaryMasha * 1.1);
        int salaryRiseDenis = (int) (salaryDenis * 1.1);
        int salaryRiseKristina = (int) (salaryKristina * 1.1);
        int annualIncomeRiseMasha = salaryRiseMasha * 12;
        int annualIncomeRiseDenis = salaryRiseDenis * 12;
        int annualIncomeRiseKristina = salaryRiseKristina * 12;
        int annualIncomeDiffMasha = annualIncomeRiseMasha - annualIncomeMasha;
        int annualIncomeDiffDenis = annualIncomeRiseDenis - annualIncomeDenis;
        int annualIncomeDiffKristina = annualIncomeRiseKristina - annualIncomeKristina;
        System.out.println("Маша теперь получает "+salaryRiseMasha+" рублей. Годовой доход вырос на "+annualIncomeDiffMasha+" рублей");
        System.out.println("Денис теперь получает "+salaryRiseDenis+" рублей. Годовой доход вырос на "+annualIncomeDiffDenis+" рублей");
        System.out.println("Кристина теперь получает "+salaryRiseKristina+" рублей. Годовой доход вырос на "+annualIncomeDiffKristina+" рублей");


    }
}