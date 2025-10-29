package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_ChR_By_Flot;
import CC.Util.By.LMNt.Set_ChR_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Flot;
import CC.$.Q$Q.ChR$ChR;
import CC.$.Q$Q.Flot$ChR;
import CC.$.Q2$.Flot_ChR$;
import CC.$.Q_Q$Q.ChR2$1;

public interface Set_ChR_By_Flot<From_Typ> extends
	Get_ChR_By_Flot,
	Set_ChR_By_Q<From_Typ>,
	Set_Q_By_Flot<From_Typ>,
	Flot_ChR$
{
	@Lin_Dclar void Set_ChR_By_Flot(float By,char Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Flot_ChR$(float By,char Valu){Set_ChR_By_Flot(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR_By_Flot_Sorc(float By,Flot$ChR Sorc){Set_ChR_By_Flot(By,Sorc.Flot$ChR(By));}

		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR1$1_By_Flot(float By,ChR$ChR Fun,char Valu)
		{Set_ChR_By_Flot(By,Fun.ChR$ChR(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR1$1_By_Flot_Sorc(float By,ChR$ChR Fun,Flot$ChR Sorc)
			{Set_ChR1$1_By_Flot(By,Fun,Sorc.Flot$ChR(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR1$1_By_Flot(float By,ChR$ChR Fun)
				{Set_ChR1$1_By_Flot_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR2$1_By_Flot(float By,ChR2$1 Fun,char A,char B)
		{Set_ChR_By_Flot(By,Fun.ChR2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR2$1_By_Flot_SLit(float By,ChR2$1 Fun,Flot$ChR A,char B)
			{Set_ChR2$1_By_Flot(By,Fun,A.Flot$ChR(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR2$1_By_Flot(float By,ChR2$1 Fun,char B)
				{Set_ChR2$1_By_Flot_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_ChR2$1_By_Flot_Sorc(float By,ChR2$1 Fun,Flot$ChR A,Flot$ChR B)
				{Set_ChR2$1_By_Flot_SLit(By,Fun,A,B.Flot$ChR(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_ChR2$1_By_Flot_Sorc(float By,ChR2$1 Fun,Flot$ChR B)
					{Set_ChR2$1_By_Flot_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default char SGet_ChR_By_Flot(float By,char Valu)
	{
		char Stor=Get_ChR_By_Flot(By);
		Set_ChR_By_Flot(By,Valu);

		return Stor;
	}
}