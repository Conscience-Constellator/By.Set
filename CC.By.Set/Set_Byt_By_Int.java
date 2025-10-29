package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Byt_By_Int;
import CC.Util.By.LMNt.Set_Q_By_Int;
import CC.Util.By.LMNt.Set_Short_By_Q;
import CC.$.Q$Q.Byt$Byt;
import CC.$.Q$Q.Int$Byt;
import CC.$.Q2$.Int_Byt$;
import CC.$.Q_Q$Q.Byt2$1;

public interface Set_Byt_By_Int<From_Typ> extends
	Get_Byt_By_Int,
	Set_Short_By_Q<From_Typ>,
	Set_Q_By_Int<From_Typ>,
	Int_Byt$
{
	@Lin_Dclar void Set_Byt_By_Int(int By,byte Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Int_Byt$(int By,byte Valu){Set_Byt_By_Int(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt_By_Int_Sorc(int By,Int$Byt Sorc){Set_Byt_By_Int(By,Sorc.Int$Byt(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt1$1_By_Int(int By,Byt$Byt Fun,byte Valu)
		{Set_Byt_By_Int(By,Fun.Byt$Byt(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt1$1_By_Int_Sorc(int By,Byt$Byt Fun,Int$Byt Sorc)
			{Set_Byt1$1_By_Int(By,Fun,Sorc.Int$Byt(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt1$1_By_Int(int By,Byt$Byt Fun)
				{Set_Byt1$1_By_Int_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt2$1_By_Int(int By,Byt2$1 Fun,byte A,byte B)
		{Set_Byt_By_Int(By,Fun.Byt2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt2$1_By_Int_SLit(int By,Byt2$1 Fun,Int$Byt A,byte B)
			{Set_Byt2$1_By_Int(By,Fun,A.Int$Byt(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt2$1_By_Int(int By,Byt2$1 Fun,byte B)
				{Set_Byt2$1_By_Int_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Byt2$1_By_Int_Sorc(int By,Byt2$1 Fun,Int$Byt A,Int$Byt B)
				{Set_Byt2$1_By_Int_SLit(By,Fun,A,B.Int$Byt(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Byt2$1_By_Int_Sorc(int By,Byt2$1 Fun,Int$Byt B)
					{Set_Byt2$1_By_Int_Sorc(By,Fun,this,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Sorc_Rang(int IndX,int Nd,Int$Byt Sorc)
		{
			for(;IndX<Nd;IndX+=1){Set_Byt_By_Int(IndX,Sorc.Int$Byt(IndX));}
		}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default byte SGet_Byt_By_Int(int By,byte Valu)
	{
		byte Stor=Get_Byt_By_Int(By);
		Set_Byt_By_Int(By,Valu);

		return Stor;
	}
}