package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_ChR_By_Short;
import CC.Util.By.LMNt.Set_ChR_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Short;
import CC.$.Q$Q.ChR$ChR;
import CC.$.Q$Q.Short$ChR;
import CC.$.Q2$.Short_ChR$;
import CC.$.Q_Q$Q.ChR2$1;

public interface Set_ChR_By_Short<From_Typ> extends
	Get_ChR_By_Short,
	Set_ChR_By_Q<From_Typ>,
	Set_Q_By_Short<From_Typ>,
	Short_ChR$
{
	@Lin_Dclar void Set_ChR_By_Short(short By,char Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Short_ChR$(short By,char Valu){Set_ChR_By_Short(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR_By_Short_Sorc(short By,Short$ChR Sorc){Set_ChR_By_Short(By,Sorc.Short$ChR(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR1$1_By_Short(short By,ChR$ChR Fun,char Valu)
		{Set_ChR_By_Short(By,Fun.ChR$ChR(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR1$1_By_Short_Sorc(short By,ChR$ChR Fun,Short$ChR Sorc)
			{Set_ChR1$1_By_Short(By,Fun,Sorc.Short$ChR(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR1$1_By_Short(short By,ChR$ChR Fun)
				{Set_ChR1$1_By_Short_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR2$1_By_Short(short By,ChR2$1 Fun,char A,char B)
		{Set_ChR_By_Short(By,Fun.ChR2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR2$1_By_Short_SLit(short By,ChR2$1 Fun,Short$ChR A,char B)
			{Set_ChR2$1_By_Short(By,Fun,A.Short$ChR(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR2$1_By_Short(short By,ChR2$1 Fun,char B)
				{Set_ChR2$1_By_Short_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_ChR2$1_By_Short_Sorc(short By,ChR2$1 Fun,Short$ChR A,Short$ChR B)
				{Set_ChR2$1_By_Short_SLit(By,Fun,A,B.Short$ChR(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_ChR2$1_By_Short_Sorc(short By,ChR2$1 Fun,Short$ChR B)
					{Set_ChR2$1_By_Short_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default char SGet_ChR_By_Short(short By,char Valu)
	{
		char Stor=Get_ChR_By_Short(By);
		Set_ChR_By_Short(By,Valu);

		return Stor;
	}
}