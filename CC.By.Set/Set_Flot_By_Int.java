package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Flot_By_Int;
import CC.Util.By.LMNt.Set_Flot_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Int;
import CC.$.Q$Q.Flot1$1;
import CC.$.Q$Q.Int$Flot;
import CC.$.Q2$.Int_Flot$;
import CC.$.Q_Q$Q.Flot2$1;

public interface Set_Flot_By_Int<From_Typ> extends
	Get_Flot_By_Int,
	Set_Q_By_Int<From_Typ>,
	Set_Flot_By_Q<From_Typ>,
	Int_Flot$
{
	@Lin_Dclar void Set_Flot_By_Int(int By,float Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Int_Flot$(int By,float Valu){Set_Flot_By_Int(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot_By_Int_Sorc(int By,Int$Flot Sorc){Set_Flot_By_Int(By,Sorc.Int$Flot(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot1$1_By_Int(int By,Flot1$1 Fun,float Valu)
		{Set_Flot_By_Int(By,Fun.Flot1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot1$1_By_Int_Sorc(int By,Flot1$1 Fun,Int$Flot Sorc)
			{Set_Flot1$1_By_Int(By,Fun,Sorc.Int$Flot(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot1$1_By_Int(int By,Flot1$1 Fun)
				{Set_Flot1$1_By_Int_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot2$1_By_Int(int By,Flot2$1 Fun,float A,float B)
		{Set_Flot_By_Int(By,Fun.Flot2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot2$1_By_Int_SLit(int By,Flot2$1 Fun,Int$Flot A,float B)
			{Set_Flot2$1_By_Int(By,Fun,A.Int$Flot(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot2$1_By_Int(int By,Flot2$1 Fun,float B)
				{Set_Flot2$1_By_Int_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Flot2$1_By_Int_Sorc(int By,Flot2$1 Fun,Int$Flot A,Int$Flot B)
				{Set_Flot2$1_By_Int_SLit(By,Fun,A,B.Int$Flot(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Flot2$1_By_Int_Sorc(int By,Flot2$1 Fun,Int$Flot B)
					{Set_Flot2$1_By_Int_Sorc(By,Fun,this,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Sorc_Rang(int IndX,int Nd,Int$Flot Sorc)
		{
			for(;IndX<Nd;IndX+=1){Set_Flot_By_Int(IndX,Sorc.Int$Flot(IndX));}
		}
		
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default float SGet_Flot_By_Int(int By,float Valu)
	{
		float Stor=Get_Flot_By_Int(By);
		Set_Flot_By_Int(By,Valu);

		return Stor;
	}
}