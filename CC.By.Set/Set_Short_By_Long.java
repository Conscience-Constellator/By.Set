package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Short_By_Long;
import CC.Util.By.LMNt.Set_Q_By_Long;
import CC.Util.By.LMNt.Set_Short_By_Q;
import CC.$.Q$Q.Long$Short;
import CC.$.Q$Q.Short1$1;
import CC.$.Q_Q$.Long_Short$;
import CC.$.Q_Q$Q.Short2$1;

public interface Set_Short_By_Long<From_Typ> extends
	Get_Short_By_Long,
	Set_Q_By_Long<From_Typ>,
	Set_Short_By_Q<From_Typ>,
	Long_Short$
{
	@Lin_Dclar void Set_Short_By_Long(long By,short Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Long_Short$(long By,short Valu){Set_Short_By_Long(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short_By_Long_Sorc(long By,Long$Short Sorc){Set_Short_By_Long(By,Sorc.Long$Short(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short1$1_By_Long(long By,Short1$1 Fun,short Valu)
		{Set_Short_By_Long(By,Fun.Short1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short1$1_By_Long_Sorc(long By,Short1$1 Fun,Long$Short Sorc)
			{Set_Short1$1_By_Long(By,Fun,Sorc.Long$Short(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short1$1_By_Long(long By,Short1$1 Fun)
				{Set_Short1$1_By_Long_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short2$1_By_Long(long By,Short2$1 Fun,short A,short B)
		{Set_Short_By_Long(By,Fun.Short2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short2$1_By_Long_SLit(long By,Short2$1 Fun,Long$Short A,short B)
			{Set_Short2$1_By_Long(By,Fun,A.Long$Short(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short2$1_By_Long(long By,Short2$1 Fun,short B)
				{Set_Short2$1_By_Long_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Short2$1_By_Long_Sorc(long By,Short2$1 Fun,Long$Short A,Long$Short B)
				{Set_Short2$1_By_Long_SLit(By,Fun,A,B.Long$Short(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Short2$1_By_Long_Sorc(long By,Short2$1 Fun,Long$Short B)
					{Set_Short2$1_By_Long_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default short SGet_Short_By_Long(long By,short Valu)
	{
		short Stor=Get_Short_By_Long(By);
		Set_Short_By_Long(By,Valu);

		return Stor;
	}
}