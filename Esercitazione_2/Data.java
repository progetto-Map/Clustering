class Data {
    // Le visibilità di classi , attributi e metodi devono essere decise dagli studenti	
        Object data [][];
        int numberOfExamples;
        Attribute attributeSet[];
        
        
        Data(){
            
            //data
            
            data = new Object [14][5];
    
            data[0][0]=new String ("sunny");
            data[1][0]=new String ("sunny");
            data[2][0]=new String ("sunny");
            data[3][0]=new String ("rain");
            data[4][0]=new String ("rain");
            data[5][0]=new String ("rain");
            data[6][0]=new String ("rain");
            data[7][0]=new String ("rain");
            data[8][0]=new String ("rain");
            data[9][0]=new String ("rain");
            data[10][0]=new String ("overcast");
            data[11][0]=new String ("overcast");
            data[12][0]=new String ("overcast");
            data[13][0]=new String ("overcast");
            
            data[0][1]=new String ("hot");
            data[1][1]=new String ("hot");
            data[2][1]=new String ("hot");
            data[3][1]=new String ("mild");
            data[4][1]=new String ("mild");
            data[5][1]=new String ("mild");
            data[6][1]=new String ("mild");
            data[7][1]=new String ("mild");
            data[8][1]=new String ("mild");
            data[9][1]=new String ("mild");
            data[10][1]=new String ("cold");
            data[11][1]=new String ("cold");
            data[12][1]=new String ("cold");
            data[13][1]=new String ("cold");
            
            data[0][2]=new String ("high");
            data[1][2]=new String ("high");
            data[2][2]=new String ("high");
            data[3][2]=new String ("normal");
            data[4][2]=new String ("normal");
            data[5][2]=new String ("normal");
            data[6][2]=new String ("normal");
            data[7][2]=new String ("normal");
            data[8][2]=new String ("normal");
            data[9][2]=new String ("normal");
            data[10][2]=new String ("high");
            data[11][2]=new String ("high");
            data[12][2]=new String ("high");
            data[13][2]=new String ("high");
            
            
            data[0][3]=new String ("weak");
            data[1][3]=new String ("weak");
            data[2][3]=new String ("weak");
            data[3][3]=new String ("strong");
            data[4][3]=new String ("strong");
            data[5][3]=new String ("strong");
            data[6][3]=new String ("strong");
            data[7][3]=new String ("strong");
            data[8][3]=new String ("strong");
            data[9][3]=new String ("strong");
            data[10][3]=new String ("strong");
            data[11][3]=new String ("strong");
            data[12][3]=new String ("strong");
            data[13][3]=new String ("strong");
            
    
            data[0][4]=new String ("no");
            data[1][4]=new String ("no");
            data[2][4]=new String ("no");
            data[3][4]=new String ("yes");
            data[4][4]=new String ("yes");
            data[5][4]=new String ("yes");
            data[6][4]=new String ("yes");
            data[7][4]=new String ("yes");
            data[8][4]=new String ("yes");
            data[9][4]=new String ("yes");
            data[10][4]=new String ("yes");
            data[11][4]=new String ("yes");
            data[12][4]=new String ("yes");
            data[13][4]=new String ("yes");
            
            data[0][0]=new String ("sunny");
            data[1][0]=new String ("sunny");
            data[2][0]=new String ("overcast");
            data[3][0]=new String ("rain");
            data[4][0]=new String ("rain");
            data[5][0]=new String ("rain");
            data[6][0]=new String ("overcast");
            data[7][0]=new String ("sunny");
            data[8][0]=new String ("sunny");
            data[9][0]=new String ("rain");
            data[10][0]=new String ("sunny");
            data[11][0]=new String ("overcast");
            data[12][0]=new String ("overcast");
            data[13][0]=new String ("rain");
            
            data[0][1]=new String ("hot");
            data[1][1]=new String ("hot");
            data[2][1]=new String ("hot");
            data[3][1]=new String ("mild");
            data[4][1]=new String ("cool");
            data[5][1]=new String ("cool");
            data[6][1]=new String ("cool");
            data[7][1]=new String ("mild");
            data[8][1]=new String ("cool");
            data[9][1]=new String ("mild");
            data[10][1]=new String ("mild");
            data[11][1]=new String ("mild");
            data[12][1]=new String ("hot");
            data[13][1]=new String ("mild");
            
            data[0][2]=new String ("high");
            data[1][2]=new String ("high");
            data[2][2]=new String ("high");
            data[3][2]=new String ("high");
            data[4][2]=new String ("normal");
            data[5][2]=new String ("normal");
            data[6][2]=new String ("normal");
            data[7][2]=new String ("high");
            data[8][2]=new String ("normal");
            data[9][2]=new String ("normal");
            data[10][2]=new String ("normal");
            data[11][2]=new String ("high");
            data[12][2]=new String ("normal");
            data[13][2]=new String ("high");
            
            
            data[0][3]=new String ("weak");
            data[1][3]=new String ("strong");
            data[2][3]=new String ("weak");
            data[3][3]=new String ("weak");
            data[4][3]=new String ("weak");
            data[5][3]=new String ("strong");
            data[6][3]=new String ("strong");
            data[7][3]=new String ("weak");
            data[8][3]=new String ("weak");
            data[9][3]=new String ("weak");
            data[10][3]=new String ("strong");
            data[11][3]=new String ("strong");
            data[12][3]=new String ("weak");
            data[13][3]=new String ("strong");
            
    
            data[0][4]=new String ("no");
            data[1][4]=new String ("no");
            data[2][4]=new String ("yes");
            data[3][4]=new String ("yes");
            data[4][4]=new String ("yes");
            data[5][4]=new String ("no");
            data[6][4]=new String ("yes");
            data[7][4]=new String ("no");
            data[8][4]=new String ("yes");
            data[9][4]=new String ("yes");
            data[10][4]=new String ("yes");
            data[11][4]=new String ("yes");
            data[12][4]=new String ("yes");
            data[13][4]=new String ("no");
    
            // numberOfExamples
            
             numberOfExamples=14;		 
             
            
            //explanatory Set
            
            attributeSet = new Attribute[5];
    
            // TO DO : avvalorare ciascune elemento di attributeSet con un oggetto della classe DiscreteAttribute che modella il corrispondente attributo (e.g. outlook, temperature,etc)
            // nel seguito si fornisce l'esempio per outlook
            
            String outLookValues[]=new String[3];
            outLookValues[0]="overcast";
            outLookValues[1]="rain";
            outLookValues[2]="sunny";
            attributeSet[0] = new DiscreteAttribute("Outlook",0, outLookValues);

            String temperatureValues[]=new String[3];
            temperatureValues[0]="Hot";
            temperatureValues[1]="Mild";
            temperatureValues[2]="Cool";
            attributeSet[1] = new DiscreteAttribute("Temperature",1, temperatureValues);

            String humidityValues[]=new String[2];
            humidityValues[0]="High";
            humidityValues[1]="Normal";
            attributeSet[2] = new DiscreteAttribute("Humidity",2, humidityValues);
            
            String windValues[]=new String[2];
            windValues[0]="Weak";
            windValues[1]="Strong";
            attributeSet[3] = new DiscreteAttribute("Wind",3, windValues);

            String playTennisValues[]=new String[2];
            playTennisValues[0]="No";
            playTennisValues[1]="Yes";
            attributeSet[4] = new DiscreteAttribute("PlayTennis",4, playTennisValues);
    
        }
        
        int getNumberOfExamples(){
            return numberOfExamples;
        }
        
        int getNumberOfAttributes(){
            return attributeSet.length;
        }
        
        
        Object getAttributeValue(int exampleIndex, int attributeIndex){
            return data[exampleIndex][attributeIndex];
        }
        
        Attribute getAttribute(int index){
            return attributeSet[index];
        }
        
        
        public String toString(){
            String s = "";
            for(int a = 0; a < attributeSet.length; a++){
                s = s + attributeSet[a].getName() + ",";
                
            }
            s = s + "\n";
            for (int b = 0; b < numberOfExamples; b++){
                s = s + (b+1) + ":";
                for(int c = 0; c < attributeSet.length; c++){
                    s = s + data[b][c] + ",";
                } 
                s = s + "\n"; 
            }
            
            return s;
        }

        
    
    
        
        public static void main(String args[]){
            Data trainingSet=new Data();
            System.out.println(trainingSet.toString());
            
            
        }
    
    }
    