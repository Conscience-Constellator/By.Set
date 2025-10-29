package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Dubl_By_Flot;
import CC.Util.By.LMNt.Set_Dubl_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Flot;
import CC.$.Q$Q.Dubl1$1;
import CC.$.Q$Q.Flot$Dubl;
import CC.$.Q2$.Flot_Dubl$;
import CC.$.Q_Q$Q.Dubl2$1;

public interface Set_Dubl_By_Flot<From_Typ> extends
	Get_Dubl_By_Flot,
	Set_Dubl_By_Q<From_Typ>,
	Set_Q_By_Flot<From_Typ>,
	Flot_Dubl$
{
	@Lin_Dclar void Set_Dubl_By_Flot(float By,double Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Flot_Dubl$(float By,double Valu){Set_Dubl_By_Flot(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl_By_Flot_Sorc(float By,Flot$Dubl Sorc){Set_Dubl_By_Flot(By,Sorc.Flot$Dubl(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl1$1_By_Flot(float By,Dubl1$1 Fun,double Valu)
		{Set_Dubl_By_Flot(By,Fun.Dubl$Dubl(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl1$1_By_Flot_Sorc(float By,Dubl1$1 Fun,Flot$Dubl Sorc)
			{Set_Dubl1$1_By_Flot(By,Fun,Sorc.Flot$Dubl(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl1$1_By_Flot(float By,Dubl1$1 Fun)
				{Set_Dubl1$1_By_Flot_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl2$1_By_Flot(float By,Dubl2$1 Fun,double A,double B)
		{Set_Dubl_By_Flot(By,Fun.Dubl2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl2$1_By_Flot_SLit(float By,Dubl2$1 Fun,Flot$Dubl A,double B)
			{Set_Dubl2$1_By_Flot(By,Fun,A.Flot$Dubl(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl2$1_By_Flot(float By,Dubl2$1 Fun,double B)
				{Set_Dubl2$1_By_Flot_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Dubl2$1_By_Flot_Sorc(float By,Dubl2$1 Fun,Flot$Dubl A,Flot$Dubl B)
				{Set_Dubl2$1_By_Flot_SLit(By,Fun,A,B.Flot$Dubl(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Dubl2$1_By_Flot_Sorc(float By,Dubl2$1 Fun,Flot$Dubl B)
					{Set_Dubl2$1_By_Flot_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default double SGet_Dubl_By_Flot(float By,double Valu)
	{
		double Stor=Get_Dubl_By_Flot(By);
		Set_Dubl_By_Flot(By,Valu);

		return Stor;
	}
}