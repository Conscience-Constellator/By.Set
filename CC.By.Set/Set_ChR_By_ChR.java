package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_ChR_By_ChR;
import CC.Util.By.LMNt.Set_ChR_By_Q;
import CC.Util.By.LMNt.Set_Q_By_ChR;
import CC.$.Q$Q.Bool$ChR;
import CC.$.Q$Q.ChR$ChR;
import CC.$.Q2$.ChR_ChR$;
import CC.$.Q_Q$Q.ChR2$1;

public interface Set_ChR_By_ChR<From_Typ> extends
	Get_ChR_By_ChR,
	Set_ChR_By_Q<From_Typ>,
	Set_Q_By_ChR<From_Typ>,
	ChR_ChR$
{
	@Lin_Dclar void Set_ChR_By_ChR(char By,char Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void ChR_ChR$(char By,char Valu){Set_ChR_By_ChR(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR_By_ChR_Sorc(char By,ChR$ChR Sorc){Set_ChR_By_ChR(By,Sorc.ChR$ChR(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR1$1_By_ChR(char By,ChR$ChR Fun,char Valu)
		{Set_ChR_By_ChR(By,Fun.ChR$ChR(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR1$1_By_ChR_Sorc(char By,ChR$ChR Fun,ChR$ChR Sorc)
			{Set_ChR1$1_By_ChR(By,Fun,Sorc.ChR$ChR(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR1$1_By_ChR(char By,ChR$ChR Fun)
				{Set_ChR1$1_By_ChR_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR2$1_By_ChR(char By,ChR2$1 Fun,char A,char B)
		{Set_ChR_By_ChR(By,Fun.ChR2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR2$1_By_ChR_SLit(char By,ChR2$1 Fun,ChR$ChR A,char B)
			{Set_ChR2$1_By_ChR(By,Fun,A.ChR$ChR(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR2$1_By_ChR(char By,ChR2$1 Fun,char B)
				{Set_ChR2$1_By_ChR_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_ChR2$1_By_ChR_Sorc(char By,ChR2$1 Fun,ChR$ChR A,ChR$ChR B)
				{Set_ChR2$1_By_ChR_SLit(By,Fun,A,B.ChR$ChR(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_ChR2$1_By_ChR_Sorc(char By,ChR2$1 Fun,ChR$ChR B)
					{Set_ChR2$1_By_ChR_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default char SGet_ChR_By_ChR(char By,char Valu)
	{
		char Stor=Get_ChR_By_ChR(By);
		Set_ChR_By_ChR(By,Valu);

		return Stor;
	}
}