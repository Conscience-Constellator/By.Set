package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Long_By_Long;
import CC.Util.By.LMNt.Set_Long_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Long;
import CC.$.Q$Q.Long1$1;
import CC.$.Q2$.Long_Long$;
import CC.$.Q_Q$Q.Long2$1;

public interface Set_Long_By_Long<From_Typ> extends
	Get_Long_By_Long,
	Set_Q_By_Long<From_Typ>,
	Set_Long_By_Q<From_Typ>,
	Long_Long$
{
	@Lin_Dclar void Set_Long_By_Long(long By,long Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Long_Long$(long By,long Valu){Set_Long_By_Long(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long_By_Long_Sorc(long By,Long1$1 Sorc){Set_Long_By_Long(By,Sorc.Long1$1(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long1$1_By_Long(long By,Long1$1 Fun,long Valu)
			{Set_Long_By_Long(By,Fun.Long1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long1$1_By_Long_Sorc(long By,Long1$1 Fun,Long1$1 Sorc)
			{Set_Long1$1_By_Long(By,Fun,Sorc.Long1$1(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long1$1_By_Long(long By,Long1$1 Fun)
				{Set_Long1$1_By_Long_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long2$1_By_Long(long By,Long2$1 Fun,long A,long B)
		{Set_Long_By_Long(By,Fun.Long2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long2$1_By_Long_SLit(long By,Long2$1 Fun,Long1$1 A,long B)
			{Set_Long2$1_By_Long(By,Fun,A.Long1$1(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long2$1_By_Long(long By,Long2$1 Fun,long B)
				{Set_Long2$1_By_Long_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Long2$1_By_Long_Sorc(long By,Long2$1 Fun,Long1$1 A,Long1$1 B)
				{Set_Long2$1_By_Long_SLit(By,Fun,A,B.Long1$1(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Long2$1_By_Long_Sorc(long By,Long2$1 Fun,Long1$1 B)
					{Set_Long2$1_By_Long_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default long SGet_Long_By_Long(long By,long Valu)
	{
		long Stor=Get_Long_By_Long(By);
		Set_Long_By_Long(By,Valu);

		return Stor;
	}
}