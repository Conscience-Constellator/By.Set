package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_ChR_By_Long;
import CC.Util.By.LMNt.Set_ChR_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Long;
import CC.$.Q$Q.ChR$ChR;
import CC.$.Q$Q.Long$ChR;
import CC.$.Q2$.Long_ChR$;
import CC.$.Q_Q$Q.ChR2$1;

public interface Set_ChR_By_Long<From_Typ> extends
	Get_ChR_By_Long,
	Set_ChR_By_Q<From_Typ>,
	Set_Q_By_Long<From_Typ>,
	Long_ChR$
{
	@Lin_Dclar void Set_ChR_By_Long(long By,char Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Long_ChR$(long By,char Valu){Set_ChR_By_Long(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR_By_Long_Sorc(long By,Long$ChR Sorc){Set_ChR_By_Long(By,Sorc.Long$ChR(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR1$1_By_Long(long By,ChR$ChR Fun,char Valu)
		{Set_ChR_By_Long(By,Fun.ChR$ChR(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR1$1_By_Long_Sorc(long By,ChR$ChR Fun,Long$ChR Sorc)
			{Set_ChR1$1_By_Long(By,Fun,Sorc.Long$ChR(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR1$1_By_Long(long By,ChR$ChR Fun)
				{Set_ChR1$1_By_Long_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR2$1_By_Long(long By,ChR2$1 Fun,char A,char B)
		{Set_ChR_By_Long(By,Fun.ChR2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR2$1_By_Long_SLit(long By,ChR2$1 Fun,Long$ChR A,char B)
			{Set_ChR2$1_By_Long(By,Fun,A.Long$ChR(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR2$1_By_Long(long By,ChR2$1 Fun,char B)
				{Set_ChR2$1_By_Long_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_ChR2$1_By_Long_Sorc(long By,ChR2$1 Fun,Long$ChR A,Long$ChR B)
				{Set_ChR2$1_By_Long_SLit(By,Fun,A,B.Long$ChR(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_ChR2$1_By_Long_Sorc(long By,ChR2$1 Fun,Long$ChR B)
					{Set_ChR2$1_By_Long_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default char SGet_ChR_By_Long(long By,char Valu)
	{
		char Stor=Get_ChR_By_Long(By);
		Set_ChR_By_Long(By,Valu);

		return Stor;
	}
}