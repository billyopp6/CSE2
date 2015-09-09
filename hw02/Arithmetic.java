//Billy Oppenheimer
//hw02
//September 8, 2015
//Here I will create a program that computes the costs of items bought at Walmart before and after tax, and the price of the tax

public class Arithmetic {
    
    public static void main(String[] args) {

        int nSocks=3; //Number of pairs of socks
        double sockCost$=2.58; //Cost per pair of socks ('$' is part of the variable name)
        
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        
        int nEnvelopes=1; //Number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
        
        double taxPercent=0.06; //PA sales tax
        
        
        double totalSockCostBeforeTaxA$=nSocks*sockCost$; //Cost of socks before tax
        int totalSockCostBeforeTaxB$=(int)(totalSockCostBeforeTaxA$*100); //Convert double to int
        double totalSockCostBeforeTaxC$=totalSockCostBeforeTaxB$/100.00; //Convert int to double
        
        double taxOnSockA$=taxPercent*totalSockCostBeforeTaxA$; //Cost of sales tax
        int taxOnSockB$=(int)(taxOnSockA$*100); //Convert double to int
        double taxOnSockC$=taxOnSockB$/100.00; //Convert int to double
        
        double totalSockCostA$=(totalSockCostBeforeTaxA$+taxOnSockA$); //total cost of socks with tax
        int totalSockCostB$=(int)(totalSockCostA$*100); //Convert double to int
        double totalSockCostC$=totalSockCostB$/100.00; //Convert int to double
        
        double totalGlassCostBeforeTaxA$=nGlasses*glassCost$; //Cost of glasses before tax
        int totalGlassCostBeforeTaxB$=(int)(totalGlassCostBeforeTaxA$*100); //Convert double to int
        double totalGlassCostBeforeTaxC$=totalGlassCostBeforeTaxB$/100.00; //Convert int to double
        
        double taxOnGlassA$=taxPercent*totalGlassCostBeforeTaxA$; //Cost of sales tax
        int taxOnGlassB$=(int)(taxOnGlassA$*100); //Convert double to int
        double taxOnGlassC$=taxOnGlassB$/100.00; //Convert int to double
        
        double totalGlassCostA$=(totalGlassCostBeforeTaxA$+taxOnGlassA$); //total cost of glasses with tax
        int totalGlassCostB$=(int)(totalGlassCostA$*100); //Convert double to int
        double totalGlassCostC$=totalGlassCostB$/100.00; //Convert int to double
        
        double totalEnvelopeCostBeforeTaxA$=nEnvelopes*envelopeCost$; //Cost of envelopes before tax
        int totalEnvelopeCostBeforeTaxB$=(int)(totalEnvelopeCostBeforeTaxA$*100); //Convert double to int
        double totalEnvelopeCostBeforeTaxC$=totalEnvelopeCostBeforeTaxB$/100.00; //Convert int to double
        
        double taxOnEnvelopeA$=taxPercent*totalEnvelopeCostBeforeTaxA$; //Cost of sales tax
        int taxOnEnvelopeB$=(int)(taxOnEnvelopeA$*100); //Convert double to int
        double taxOnEnvelopeC$=taxOnEnvelopeB$/100.00; //Convert int to double
        
        double totalEnvelopeCostA$=(totalEnvelopeCostBeforeTaxA$+taxOnGlassA$); //total cost of envelopes with tax
        int totalEnvelopeCostB$=(int)(totalEnvelopeCostA$*100); //Convert double to int
        double totalEnvelopeCostC$=totalEnvelopeCostB$/100.00; //Convert int to double
        
        double totalCostBeforeTaxA$=totalSockCostBeforeTaxA$+totalGlassCostBeforeTaxA$+totalEnvelopeCostBeforeTaxA$; //Total cost of purchase before tax
        int totalCostBeforeTaxB$=(int)(totalCostBeforeTaxA$*100); //convert double to int
        double totalCostBeforeTaxC$=totalCostBeforeTaxB$/100.00; //convert int to double
        
        double totalTaxA$=taxOnSockA$+taxOnGlassA$+taxOnEnvelopeA$; //total cost of tax
        int totalTaxB$=(int)(totalTaxA$*100); //convert double to int
        double totalTaxC$=totalTaxB$/100.00; //convert int to double
        
        double totalCostA$=totalSockCostA$+totalGlassCostA$+totalEnvelopeCostA$; //total cost of purchase with tax
        int totalCostB$=(int)(totalCostA$*100); //convert double to int
        double totalCostC$=totalCostB$/100.00; //conver int to double
        
        System.out.println("The cost of the socks before tax $" + totalSockCostBeforeTaxC$); //This statement will print the cost of the socks before the tax
        System.out.println("The cost of the tax on socks is $" + taxOnSockC$); //This statement will print the cost of the tax on socks
        System.out.println("The cost of the socks after tax is $" + totalSockCostC$); //This statement will print the cost of the socks with the tax
        
        System.out.println("The cost of the glasses before tax $" + totalGlassCostBeforeTaxC$); //This statement will print the cost of the glasses before the tax
        System.out.println("The cost of the tax on glasses is $" + taxOnGlassC$); //This statement will print the cost of the tax on glasses
        System.out.println("The cost of the glasses after tax is $" + totalGlassCostC$); //This statement will print the cost of the glasses with the tax
        
        System.out.println("The cost of the envelopes before tax $" + totalEnvelopeCostBeforeTaxC$); //This statement will print the cost of the envelopes before the tax
        System.out.println("The cost of the tax on envelopes is $" + taxOnEnvelopeC$); //This statement will print the cost of the tax on envelopes
        System.out.println("The cost of the envelopes after tax is $" + totalEnvelopeCostC$); //This statement will print the cost of the envelopes with the tax
        
        System.out.println("The total cost of the purcase before tax $" + totalCostBeforeTaxC$); //This statement will print the total cost of the purchase before the tax
        System.out.println("The total cost of the tax is $" + totalTaxC$); //This statement will print the total cost of the tax 
        System.out.println("The cost of the purchase after tax is $" + totalCostC$); //This statement will print the total cost of the purchase with the tax
        
    }
}