package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_ChR_By_Dubl;
import CC.Util.By.LMNt.Set_ChR_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Dubl;
import CC.$.Q$Q.Bool$ChR;
import CC.$.Q$Q.ChR$ChR;
import CC.$.Q$Q.Dubl$ChR;
import CC.$.Q_Q$.Dubl_ChR$;
import CC.$.Q_Q$Q.ChR2$1;

public interface Set_ChR_By_Dubl<From_Typ> extends
	Get_ChR_By_Dubl,
	Set_ChR_By_Q<From_Typ>,
	Set_Q_By_Dubl<From_Typ>,
	Dubl_ChR$
{
	@Lin_Dclar void Set_ChR_By_Dubl(double By,char Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Dubl_ChR$(double By,char Valu){Set_ChR_By_Dubl(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR_By_Dubl_Sorc(double By,Dubl$ChR Sorc){Set_ChR_By_Dubl(By,Sorc.Dubl$ChR(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR1$1_By_Dubl(double By,ChR$ChR Fun,char Valu)
		{Set_ChR_By_Dubl(By,Fun.ChR$ChR(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR1$1_By_Dubl_Sorc(double By,ChR$ChR Fun,Dubl$ChR Sorc)
			{Set_ChR1$1_By_Dubl(By,Fun,Sorc.Dubl$ChR(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR1$1_By_Dubl(double By,ChR$ChR Fun)
				{Set_ChR1$1_By_Dubl_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR2$1_By_Dubl(double By,ChR2$1 Fun,char A,char B)
		{Set_ChR_By_Dubl(By,Fun.ChR2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR2$1_By_Dubl_SLit(double By,ChR2$1 Fun,Dubl$ChR A,char B)
			{Set_ChR2$1_By_Dubl(By,Fun,A.Dubl$ChR(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR2$1_By_Dubl(double By,ChR2$1 Fun,char B)
				{Set_ChR2$1_By_Dubl_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_ChR2$1_By_Dubl_Sorc(double By,ChR2$1 Fun,Dubl$ChR A,Dubl$ChR B)
				{Set_ChR2$1_By_Dubl_SLit(By,Fun,A,B.Dubl$ChR(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_ChR2$1_By_Dubl_Sorc(double By,ChR2$1 Fun,Dubl$ChR B)
					{Set_ChR2$1_By_Dubl_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default char SGet_ChR_By_Dubl(double By,char Valu)
	{
		char Stor=Get_ChR_By_Dubl(By);
		Set_ChR_By_Dubl(By,Valu);

		return Stor;
	}
}