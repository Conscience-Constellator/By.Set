package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Long_By_Short;
import CC.Util.By.LMNt.Set_Long_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Short;
import CC.$.Q$Q.Long1$1;
import CC.$.Q$Q.Short$Long;
import CC.$.Q2$.Short_Long$;
import CC.$.Q_Q$Q.Long2$1;

public interface Set_Long_By_Short<From_Typ> extends
	Get_Long_By_Short,
	Set_Q_By_Short<From_Typ>,
	Set_Long_By_Q<From_Typ>,
	Short_Long$
{
	@Lin_Dclar void Set_Long_By_Short(short By,long Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Short_Long$(short By,long Valu){Set_Long_By_Short(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long_By_Short_Sorc(short By,Short$Long Sorc){Set_Long_By_Short(By,Sorc.Short$Long(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long1$1_By_Short(short By,Long1$1 Fun,long Valu)
		{Set_Long_By_Short(By,Fun.Long1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long1$1_By_Short_Sorc(short By,Long1$1 Fun,Short$Long Sorc)
			{Set_Long1$1_By_Short(By,Fun,Sorc.Short$Long(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long1$1_By_Short(short By,Long1$1 Fun)
				{Set_Long1$1_By_Short_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long2$1_By_Short(short By,Long2$1 Fun,long A,long B)
		{Set_Long_By_Short(By,Fun.Long2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long2$1_By_Short_SLit(short By,Long2$1 Fun,Short$Long A,long B)
			{Set_Long2$1_By_Short(By,Fun,A.Short$Long(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long2$1_By_Short(short By,Long2$1 Fun,long B)
				{Set_Long2$1_By_Short_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Long2$1_By_Short_Sorc(short By,Long2$1 Fun,Short$Long A,Short$Long B)
				{Set_Long2$1_By_Short_SLit(By,Fun,A,B.Short$Long(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Long2$1_By_Short_Sorc(short By,Long2$1 Fun,Short$Long B)
					{Set_Long2$1_By_Short_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default long SGet_Long_By_Short(short By,long Valu)
	{
		long Stor=Get_Long_By_Short(By);
		Set_Long_By_Short(By,Valu);

		return Stor;
	}
}