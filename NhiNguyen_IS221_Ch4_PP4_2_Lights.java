/*
------------------------------------------------------------------------------
   Name:     NhiNguyen_IS221_Ch4_PP4_2_Lights
   Author:   Nhi Nguyen
   Date:     Feb 21, 2023
   Language: Java
   Purpose:  The purpose of this program is to create  a driver class called 
             Lights whose main method instantitates and turns on some 
             NhiNguyen_IS221_Ch4_PP4_2_Bulb objects.
------------------------------------------------------------------------------
   ChangeLog:
   Who:      Nhi Nguyen            Date:     Feb 21, 2023
   Desc.:    This is the original version of the code.
------------------------------------------------------------------------------
*/

package nhinguyen_is221_ch4_pp4_2;


public class NhiNguyen_IS221_Ch4_PP4_2_Lights {

    public static void main(String[] args) {
        NhiNguyen_IS221_Ch4_PP4_2_Bulb bulb1 = new NhiNguyen_IS221_Ch4_PP4_2_Bulb();
        NhiNguyen_IS221_Ch4_PP4_2_Bulb bulb2 = new NhiNguyen_IS221_Ch4_PP4_2_Bulb();
        
        bulb1.turnOn();
        System.out.println("Bulb 1 is on: " + bulb1.bln_isOn());
        
        bulb2.turnOff();
        System.out.println("Bulb 2 is on: " + bulb2.bln_isOn());
    }

}
