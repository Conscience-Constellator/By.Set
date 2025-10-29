package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Dubl_By_Bool;
import CC.Util.By.LMNt.Set_Dubl_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Bool;
import CC.$.Q$Q.Bool$Dubl;
import CC.$.Q$Q.Dubl1$1;
import CC.$.Q2$.Bool_Dubl$;
import CC.$.Q_Q$Q.Dubl2$1;

public interface Set_Dubl_By_Bool<From_Typ> extends
		Get_Dubl_By_Bool,
		Set_Dubl_By_Q<From_Typ>,
		Set_Q_By_Bool<From_Typ>,
		Bool_Dubl$
{
	@Lin_Dclar
	void Set_Dubl_By_Bool(boolean By,double Valu);
		@Override @Neds_Ovrid(NEds=No)
		default void Bool_Dubl$(boolean By,double Valu){Set_Dubl_By_Bool(By,Valu);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Dubl_By_Bool_Sorc(boolean By,Bool$Dubl Sorc){Set_Dubl_By_Bool(By,Sorc.Bool$Dubl(By));}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Dubl1$1_By_Bool(boolean By,Dubl1$1 Fun,double Valu)
		{Set_Dubl_By_Bool(By,Fun.Dubl$Dubl(Valu));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Dubl1$1_By_Bool_Sorc(boolean By,Dubl1$1 Fun,Bool$Dubl Sorc)
			{Set_Dubl1$1_By_Bool(By,Fun,Sorc.Bool$Dubl(By));}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Dubl1$1_By_Bool(boolean By,Dubl1$1 Fun)
				{Set_Dubl1$1_By_Bool_Sorc(By,Fun,this);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Dubl2$1_By_Bool(boolean By,Dubl2$1 Fun,double A,double B)
		{Set_Dubl_By_Bool(By,Fun.Dubl2$1(A,B));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Dubl2$1_By_Bool_SLit(boolean By,Dubl2$1 Fun,Bool$Dubl A,double B)
			{Set_Dubl2$1_By_Bool(By,Fun,A.Bool$Dubl(By),B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Dubl2$1_By_Bool(boolean By,Dubl2$1 Fun,double B)
				{Set_Dubl2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Set_Dubl2$1_By_Bool_Sorc(boolean By,Dubl2$1 Fun,Bool$Dubl A,Bool$Dubl B)
				{Set_Dubl2$1_By_Bool_SLit(By,Fun,A,B.Bool$Dubl(By));}
					@Lin_Dclar @Neds_Ovrid(NEds=No)
					default void Mod_Dubl2$1_By_Bool_Sorc(boolean By,Dubl2$1 Fun,Bool$Dubl B)
					{Set_Dubl2$1_By_Bool_Sorc(By,Fun,this,B);}

	@Lin_Dclar @Neds_Ovrid(NEds=No)
	default double SGet_Dubl_By_Bool(boolean By,double Valu)
	{
		double Stor=Get_Dubl_By_Bool(By);
		Set_Dubl_By_Bool(By,Valu);

		return Stor;
	}
}