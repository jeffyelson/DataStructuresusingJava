~~~
Algorithm: Make a Cake/Potion
Input: Flour , Oil , Butter , Eggs , Chocolate_Powder , Sugar , Frosting , Sprinkles
Output: chocolate cake
---
BEGIN
SET Wet_Ingredients := Oil+Butter+Eggs
SET Dry_Ingredients := Flour+Chocolate_Powder+Sugar
SET Batter := Wet_Ingredients+Dry_Ingredients

WHILE (Mixing_Time < 5 ):
      
      DO :
      Mix Batter
      Mixing_Time=Mixing_Time-1

ENDWHILE

SET Pre_Heat_Temperature := 180

WHILE (Heating_Time < 10 ) :

       DO:
       Heat Oven
       Heating_Time=Heating_Time-1
       
ENDWHILE

IF Heating_Time EQUAL TO 0
    THEN put batter into Oven
    
WHILE (Baking_Time < 30 ):

       DO:
       Bake Cake
       Baking_Time=Baking_Time-1
       
ENDWHILE

IF Cake EQUAL TO Cooled
   THEN 
   SET Chocolate_Cake := Frosting + Sprinkles
ELSE 
   Cool Cake
   
END




~~~