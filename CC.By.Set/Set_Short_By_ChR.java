package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Short_By_ChR;
import CC.Util.By.LMNt.Set_Q_By_ChR;
import CC.Util.By.LMNt.Set_Short_By_Q;
import CC.$.Q$Q.ChR$Short;
import CC.$.Q$Q.Short1$1;
import CC.$.Q_Q$.ChR_Short$;
import CC.$.Q_Q$Q.Short2$1;

public interface Set_Short_By_ChR<From_Typ> extends
	Get_Short_By_ChR,
	Set_Q_By_ChR<From_Typ>,
	Set_Short_By_Q<From_Typ>,
	ChR_Short$
{
	@Lin_Dclar void Set_Short_By_ChR(char By,short Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void ChR_Short$(char By,short Valu){Set_Short_By_ChR(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short_By_ChR_Sorc(char By,ChR$Short Sorc){Set_Short_By_ChR(By,Sorc.ChR$Short(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short1$1_By_ChR(char By,Short1$1 Fun,short Valu)
		{Set_Short_By_ChR(By,Fun.Short1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short1$1_By_ChR_Sorc(char By,Short1$1 Fun,ChR$Short Sorc)
			{Set_Short1$1_By_ChR(By,Fun,Sorc.ChR$Short(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short1$1_By_ChR(char By,Short1$1 Fun)
				{Set_Short1$1_By_ChR_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short2$1_By_ChR(char By,Short2$1 Fun,short A,short B)
		{Set_Short_By_ChR(By,Fun.Short2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short2$1_By_ChR_SLit(char By,Short2$1 Fun,ChR$Short A,short B)
			{Set_Short2$1_By_ChR(By,Fun,A.ChR$Short(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short2$1_By_ChR(char By,Short2$1 Fun,short B)
				{Set_Short2$1_By_ChR_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Short2$1_By_ChR_Sorc(char By,Short2$1 Fun,ChR$Short A,ChR$Short B)
				{Set_Short2$1_By_ChR_SLit(By,Fun,A,B.ChR$Short(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Short2$1_By_ChR_Sorc(char By,Short2$1 Fun,ChR$Short B)
					{Set_Short2$1_By_ChR_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default short SGet_Short_By_ChR(char By,short Valu)
	{
		short Stor=Get_Short_By_ChR(By);
		Set_Short_By_ChR(By,Valu);

		return Stor;
	}
}