package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_ChR_By_Int;
import CC.Util.By.LMNt.Set_ChR_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Int;
import CC.$.Q$Q.ChR$ChR;
import CC.$.Q$Q.Int$ChR;
import CC.$.Q2$.Int_ChR$;
import CC.$.Q_Q$Q.ChR2$1;

public interface Set_ChR_By_Int<From_Typ> extends
	Get_ChR_By_Int,
	Set_ChR_By_Q<From_Typ>,
	Set_Q_By_Int<From_Typ>,
	Int_ChR$
{
	@Lin_Dclar
	void Set_ChR_By_Int(int By,char Valu);
		@Override @Neds_Ovrid(NEds=No)
		default void Int_ChR$(int By,char Valu)
		{Set_ChR_By_Int(By,Valu);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_ChR_By_Int_Sorc(int By,Int$ChR Sorc)
		{Set_ChR_By_Int(By,Sorc.Int$ChR(By));}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_ChR1$1_By_Int(int By,ChR$ChR Fun,char Valu)
		{Set_ChR_By_Int(By,Fun.ChR$ChR(Valu));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_ChR1$1_By_Int_Sorc(int By,ChR$ChR Fun,Int$ChR Sorc)
			{Set_ChR1$1_By_Int(By,Fun,Sorc.Int$ChR(By));}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_ChR1$1_By_Int(int By,ChR$ChR Fun)
				{Set_ChR1$1_By_Int_Sorc(By,Fun,this);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_ChR2$1_By_Int(int By,ChR2$1 Fun,char A,char B)
		{Set_ChR_By_Int(By,Fun.ChR2$1(A,B));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_ChR2$1_By_Int_SLit(int By,ChR2$1 Fun,Int$ChR A,char B)
			{Set_ChR2$1_By_Int(By,Fun,A.Int$ChR(By),B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_ChR2$1_By_Int(int By,ChR2$1 Fun,char B)
				{Set_ChR2$1_By_Int_SLit(By,Fun,this,B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Set_ChR2$1_By_Int_Sorc(int By,ChR2$1 Fun,Int$ChR A,Int$ChR B)
				{Set_ChR2$1_By_Int_SLit(By,Fun,A,B.Int$ChR(By));}
					@Lin_Dclar @Neds_Ovrid(NEds=No)
					default void Mod_ChR2$1_By_Int_Sorc(int By,ChR2$1 Fun,Int$ChR B)
					{Set_ChR2$1_By_Int_Sorc(By,Fun,this,B);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Sorc_Rang(int IndX,int Nd,Int$ChR Sorc)
		{
			for(;IndX<Nd;IndX+=1){Set_ChR_By_Int(IndX,Sorc.Int$ChR(IndX));}
		}

	@Lin_Dclar @Neds_Ovrid(NEds=No)
	default char SGet_ChR_By_Int(int By,char Valu)
	{
		char Stor=Get_ChR_By_Int(By);
		Set_ChR_By_Int(By,Valu);

		return Stor;
	}
}