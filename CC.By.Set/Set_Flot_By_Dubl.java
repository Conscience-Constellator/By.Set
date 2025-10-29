package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Flot_By_Dubl;
import CC.Util.By.LMNt.Set_Flot_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Dubl;
import CC.$.Q$Q.Dubl$Flot;
import CC.$.Q$Q.Flot1$1;
import CC.$.Q2$.Dubl_Flot$;
import CC.$.Q_Q$Q.Flot2$1;

public interface Set_Flot_By_Dubl<From_Typ> extends
	Get_Flot_By_Dubl,
	Set_Q_By_Dubl<From_Typ>,
	Set_Flot_By_Q<From_Typ>,
	Dubl_Flot$
{
	@Lin_Dclar void Set_Flot_By_Dubl(double By,float Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Dubl_Flot$(double By,float Valu){Set_Flot_By_Dubl(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot_By_Dubl_Sorc(double By,Dubl$Flot Sorc){Set_Flot_By_Dubl(By,Sorc.Dubl$Flot(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot1$1_By_Dubl(double By,Flot1$1 Fun,float Valu)
		{Set_Flot_By_Dubl(By,Fun.Flot1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot1$1_By_Dubl_Sorc(double By,Flot1$1 Fun,Dubl$Flot Sorc)
			{Set_Flot1$1_By_Dubl(By,Fun,Sorc.Dubl$Flot(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot1$1_By_Dubl(double By,Flot1$1 Fun)
				{Set_Flot1$1_By_Dubl_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot2$1_By_Dubl(double By,Flot2$1 Fun,float A,float B)
		{Set_Flot_By_Dubl(By,Fun.Flot2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot2$1_By_Dubl_SLit(double By,Flot2$1 Fun,Dubl$Flot A,float B)
			{Set_Flot2$1_By_Dubl(By,Fun,A.Dubl$Flot(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot2$1_By_Dubl(double By,Flot2$1 Fun,float B)
				{Set_Flot2$1_By_Dubl_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Flot2$1_By_Dubl_Sorc(double By,Flot2$1 Fun,Dubl$Flot A,Dubl$Flot B)
				{Set_Flot2$1_By_Dubl_SLit(By,Fun,A,B.Dubl$Flot(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Flot2$1_By_Dubl_Sorc(double By,Flot2$1 Fun,Dubl$Flot B)
					{Set_Flot2$1_By_Dubl_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default float SGet_Flot_By_Dubl(double By,float Valu)
	{
		float Stor=Get_Flot_By_Dubl(By);
		Set_Flot_By_Dubl(By,Valu);

		return Stor;
	}
}