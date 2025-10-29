package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_ChR_By_Byt;
import CC.Util.By.LMNt.Set_ChR_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Byt;
import CC.$.Q$Q.Bool$ChR;
import CC.$.Q$Q.Byt$ChR;
import CC.$.Q$Q.ChR$ChR;
import CC.$.Q2$.Byt_ChR$;
import CC.$.Q_Q$Q.ChR2$1;

public interface Set_ChR_By_Byt<From_Typ> extends
	Get_ChR_By_Byt,
	Set_ChR_By_Q<From_Typ>,
	Set_Q_By_Byt<From_Typ>,
	Byt_ChR$
{
	@Lin_Dclar void Set_ChR_By_Byt(byte By,char Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Byt_ChR$(byte By,char Valu){Set_ChR_By_Byt(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR_By_Byt_Sorc(byte By,Byt$ChR Sorc){Set_ChR_By_Byt(By,Sorc.Byt$ChR(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR1$1_By_Byt(byte By,ChR$ChR Fun,char Valu)
		{Set_ChR_By_Byt(By,Fun.ChR$ChR(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR1$1_By_Byt_Sorc(byte By,ChR$ChR Fun,Byt$ChR Sorc)
			{Set_ChR1$1_By_Byt(By,Fun,Sorc.Byt$ChR(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR1$1_By_Byt(byte By,ChR$ChR Fun)
				{Set_ChR1$1_By_Byt_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR2$1_By_Byt(byte By,ChR2$1 Fun,char A,char B)
		{Set_ChR_By_Byt(By,Fun.ChR2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR2$1_By_Byt_SLit(byte By,ChR2$1 Fun,Byt$ChR A,char B)
			{Set_ChR2$1_By_Byt(By,Fun,A.Byt$ChR(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR2$1_By_Byt(byte By,ChR2$1 Fun,char B)
				{Set_ChR2$1_By_Byt_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_ChR2$1_By_Byt_Sorc(byte By,ChR2$1 Fun,Byt$ChR A,Byt$ChR B)
				{Set_ChR2$1_By_Byt_SLit(By,Fun,A,B.Byt$ChR(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_ChR2$1_By_Byt_Sorc(byte By,ChR2$1 Fun,Byt$ChR B)
					{Set_ChR2$1_By_Byt_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default char SGet_ChR_By_Byt(byte By,char Valu)
	{
		char Stor=Get_ChR_By_Byt(By);
		Set_ChR_By_Byt(By,Valu);

		return Stor;
	}
}