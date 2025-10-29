package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Bool_By_Int;
import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Bool;
import CC.$.Q$Q.Int$Bool;
import CC.$.Q_Q$Q.Bool2$1;

public interface Set_Bool_By_Int<From_Typ> extends
	Get_Bool_By_Int,
	Set_Bool_By_Q<From_Typ>,
	Set_Q_By_Int<From_Typ>
{
	@Lin_Dclar void Set_Bool_By_Int(int By,boolean Valu);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Int_Bool$(int A,boolean B){Set_Bool_By_Int(A,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool_By_Int_Sorc(int By,Int$Bool Sorc){Set_Bool_By_Int(By,Sorc.Int$Bool(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Sorc_Rang(int IndX,int Nd,Int$Bool Sorc)
		{for(;IndX<Nd;IndX+=1){Set_Bool_By_Int(IndX,Sorc.Int$Bool(IndX));}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool1$1_By_Int(int By,Bool$Bool Fun,boolean Valu)
		{Set_Bool_By_Int(By,Fun.Bool$Bool(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool1$1_By_Int_Sorc(int By,Bool$Bool Fun,Int$Bool Sorc)
			{Set_Bool1$1_By_Int(By,Fun,Sorc.Int$Bool(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool1$1_By_Int(int By,Bool$Bool Fun)
				{Set_Bool1$1_By_Int_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool2$1_By_Int(int By,Bool2$1 Fun,boolean A,boolean B)
		{Set_Bool_By_Int(By,Fun.Bool2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool2$1_By_Int_SLit(int By,Bool2$1 Fun,Int$Bool A,boolean B)
			{Set_Bool2$1_By_Int(By,Fun,A.Int$Bool(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool2$1_By_Int(int By,Bool2$1 Fun,boolean B)
				{Set_Bool2$1_By_Int_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Bool2$1_By_Int_Sorc(int By,Bool2$1 Fun,Int$Bool A,Int$Bool B)
				{Set_Bool2$1_By_Int_SLit(By,Fun,A,B.Int$Bool(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Bool2$1_By_Int_Sorc(int By,Bool2$1 Fun,Int$Bool B)
					{Set_Bool2$1_By_Int_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default boolean SGet_Bool_By_Int(int By,boolean Valu)
	{
		boolean Stor=Get_Bool_By_Int(By);
		Set_Bool_By_Int(By,Valu);

		return Stor;
	}
}