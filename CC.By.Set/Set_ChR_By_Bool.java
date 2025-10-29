package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_ChR_By_Bool;
import CC.Util.By.LMNt.Set_ChR_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Bool;
import CC.$.Q$Q.Bool$ChR;
import CC.$.Q$Q.ChR$ChR;
import CC.$.Q2$.Bool_ChR$;
import CC.$.Q_Q$Q.ChR2$1;

public interface Set_ChR_By_Bool<From_Typ> extends
	Get_ChR_By_Bool,
	Set_ChR_By_Q<From_Typ>,
	Set_Q_By_Bool<From_Typ>,
	Bool_ChR$
{
	@Lin_Dclar void Set_ChR_By_Bool(boolean By,char Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Bool_ChR$(boolean By,char Valu){Set_ChR_By_Bool(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR_By_Bool_Sorc(boolean By,Bool$ChR Sorc){Set_ChR_By_Bool(By,Sorc.Bool$ChR(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR1$1_By_Bool(boolean By,ChR$ChR Fun,char Valu)
		{Set_ChR_By_Bool(By,Fun.ChR$ChR(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR1$1_By_Bool_Sorc(boolean By,ChR$ChR Fun,Bool$ChR Sorc)
			{Set_ChR1$1_By_Bool(By,Fun,Sorc.Bool$ChR(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR1$1_By_Bool(boolean By,ChR$ChR Fun)
				{Set_ChR1$1_By_Bool_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR2$1_By_Bool(boolean By,ChR2$1 Fun,char A,char B)
		{Set_ChR_By_Bool(By,Fun.ChR2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR2$1_By_Bool_SLit(boolean By,ChR2$1 Fun,Bool$ChR A,char B)
			{Set_ChR2$1_By_Bool(By,Fun,A.Bool$ChR(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR2$1_By_Bool(boolean By,ChR2$1 Fun,char B)
				{Set_ChR2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_ChR2$1_By_Bool_Sorc(boolean By,ChR2$1 Fun,Bool$ChR A,Bool$ChR B)
				{Set_ChR2$1_By_Bool_SLit(By,Fun,A,B.Bool$ChR(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_ChR2$1_By_Bool_Sorc(boolean By,ChR2$1 Fun,Bool$ChR B)
					{Set_ChR2$1_By_Bool_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default char SGet_ChR_By_Bool(boolean By,char Valu)
	{
		char Stor=Get_ChR_By_Bool(By);
		Set_ChR_By_Bool(By,Valu);

		return Stor;
	}
}