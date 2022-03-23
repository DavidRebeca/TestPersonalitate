public class TestResult{

    int f[]=new int[6];

    public String getResult(){
        int maxi=-1;
        for(int i=0; i<4; i++)
            if(f[i]>maxi)
                maxi=f[i];
        if(maxi==f[0]){
            return " Unii te-ar putea considera naiv si timid. " +
                    "Nu te prea intereseaza ce se intampla in jurul tau. "+
                    "Singurele persoane de care chiar iti pasa sunt prietenii si familia ta. " +
                    "Iti plac relatiile pe care deja le ai si ideea de a intalni noi oameni nu te incanta.   ";
        }
        if(maxi==f[1]){
            return "  Ai o gramada de ideei originale. " +
                    " Din pacate consideri ca doar ideiile tale sunt demne de pus in practica. " +
                    "Cu toate acestea, exuberanța ta te ajută să depășești orice provocare!  ";
        }
        if(maxi==f[2]){
            return "  Iti place sa fii intodeauna in centrul atentiei. " +
                    "Esti plin de energie si oamenii vor sa fii in preajma lor pentru a aduce o stare de spirit buna. " +
                    "Esti un optimist convins care vede mereu parte plina a paharului!  ";
        }
        if(maxi==f[3]){
            return "  Nu iti pasa de absolut nimic. Mereu faci ceea ce doresti fara sa iti pese de ce ar spune alti oameni. " +
                    "Esti creativ si iti place sa fii singuratic.  ";
        }
        if(maxi==f[4]){
            return "  Faci tot posibilul sa fii in centrul atentiei chiar daca nu te vezi fata in fata cu ceilalti. " +
                    "Ai grija cu cine te imprietenesti! Daca nu iti plac persoanele pe care le numesti prieteni, " +
                    "ar trebui sa cauti in alta parte.  ";
        }
        if(maxi==-1){
            return " Nu ati selectat nicio varianta! " ;
        }
        return null;
    }

}
