package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Dubl_By_Byt;
import CC.Util.By.LMNt.Set_Dubl_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Byt;
import CC.$.Q$Q.Byt$Dubl;
import CC.$.Q$Q.Dubl1$1;
import CC.$.Q2$.Byt_Dubl$;
import CC.$.Q_Q$Q.Dubl2$1;

public interface Set_Dubl_By_Byt<From_Typ> extends
	Get_Dubl_By_Byt,
	Set_Dubl_By_Q<From_Typ>,
	Set_Q_By_Byt<From_Typ>,
	Byt_Dubl$
{
	@Lin_Dclar
	void Set_Dubl_By_Byt(byte By,double ValU);
		@Override @Neds_Ovrid(NEds=No)
		default void Byt_Dubl$(byte By,double Valu)
		{Set_Dubl_By_Byt(By,Valu);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Dubl_By_Byt_Sorc(byte By,Byt$Dubl Sorc)
		{Set_Dubl_By_Byt(By,Sorc.Byt$Dubl(By));}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Dubl1$1_By_Byt(byte By,Dubl1$1 Fun,double Valu)
		{Set_Dubl_By_Byt(By,Fun.Dubl$Dubl(Valu));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Dubl1$1_By_Byt_Sorc(byte By,Dubl1$1 Fun,Byt$Dubl Sorc)
			{Set_Dubl1$1_By_Byt(By,Fun,Sorc.Byt$Dubl(By));}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Dubl1$1_By_Byt(byte By,Dubl1$1 Fun)
				{Set_Dubl1$1_By_Byt_Sorc(By,Fun,this);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Dubl2$1_By_Byt(byte By,Dubl2$1 Fun,double A,double B)
		{Set_Dubl_By_Byt(By,Fun.Dubl2$1(A,B));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Dubl2$1_By_Byt_SLit(byte By,Dubl2$1 Fun,Byt$Dubl A,double B)
			{Set_Dubl2$1_By_Byt(By,Fun,A.Byt$Dubl(By),B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Dubl2$1_By_Byt(byte By,Dubl2$1 Fun,double B)
				{Set_Dubl2$1_By_Byt_SLit(By,Fun,this,B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Set_Dubl2$1_By_Byt_Sorc(byte By,Dubl2$1 Fun,Byt$Dubl A,Byt$Dubl B)
				{Set_Dubl2$1_By_Byt_SLit(By,Fun,A,B.Byt$Dubl(By));}
					@Lin_Dclar @Neds_Ovrid(NEds=No)
					default void Mod_Dubl2$1_By_Byt_Sorc(byte By,Dubl2$1 Fun,Byt$Dubl B)
					{Set_Dubl2$1_By_Byt_Sorc(By,Fun,this,B);}

	@Lin_Dclar @Neds_Ovrid(NEds=No)
	default double SGet_Dubl_By_Byt(byte By,double Valu)
	{
		double Stor=Get_Dubl_By_Byt(By);
		Set_Dubl_By_Byt(By,Valu);

		return Stor;
	}
}