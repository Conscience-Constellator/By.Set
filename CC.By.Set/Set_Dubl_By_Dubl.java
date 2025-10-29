package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Dubl_By_Dubl;
import CC.Util.By.LMNt.Set_Dubl_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Dubl;
import CC.$.Q$Q.Dubl1$1;
import CC.$.Q2$.Dubl_Dubl$;
import CC.$.Q_Q$Q.Dubl2$1;

public interface Set_Dubl_By_Dubl<From_Typ> extends
	Get_Dubl_By_Dubl,
	Set_Dubl_By_Q<From_Typ>,
	Set_Q_By_Dubl<From_Typ>,
	Dubl_Dubl$
{
	@Lin_Dclar void Set_Dubl_By_Dubl(double By,double Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Dubl_Dubl$(double By,double Valu){Set_Dubl_By_Dubl(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl_By_Dubl_Sorc(double By,Dubl1$1 Sorc){Set_Dubl_By_Dubl(By,Sorc.Dubl$Dubl(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl1$1_By_Dubl(double By,Dubl1$1 Fun,double Valu)
		{Set_Dubl_By_Dubl(By,Fun.Dubl$Dubl(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl1$1_By_Dubl_Sorc(double By,Dubl1$1 Fun,Dubl1$1 Sorc)
			{Set_Dubl1$1_By_Dubl(By,Fun,Sorc.Dubl$Dubl(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl1$1_By_Dubl(double By,Dubl1$1 Fun)
				{Set_Dubl1$1_By_Dubl_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl2$1_By_Dubl(double By,Dubl2$1 Fun,double A,double B)
		{Set_Dubl_By_Dubl(By,Fun.Dubl2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl2$1_By_Dubl_SLit(double By,Dubl2$1 Fun,Dubl1$1 A,double B)
			{Set_Dubl2$1_By_Dubl(By,Fun,A.Dubl$Dubl(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl2$1_By_Dubl(double By,Dubl2$1 Fun,double B)
				{Set_Dubl2$1_By_Dubl_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Dubl2$1_By_Dubl_Sorc(double By,Dubl2$1 Fun,Dubl1$1 A,Dubl1$1 B)
				{Set_Dubl2$1_By_Dubl_SLit(By,Fun,A,B.Dubl$Dubl(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Dubl2$1_By_Dubl_Sorc(double By,Dubl2$1 Fun,Dubl1$1 B)
					{Set_Dubl2$1_By_Dubl_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default double SGet_Dubl_By_Dubl(double By,double Valu)
	{
		double Stor=Get_Dubl_By_Dubl(By);
		Set_Dubl_By_Dubl(By,Valu);

		return Stor;
	}
}