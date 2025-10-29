package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Long_By_Flot;
import CC.Util.By.LMNt.Set_Long_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Flot;
import CC.$.Q$Q.Flot$Long;
import CC.$.Q$Q.Long1$1;
import CC.$.Q2$.Flot_Long$;
import CC.$.Q_Q$Q.Long2$1;

public interface Set_Long_By_Flot<From_Typ> extends
	Get_Long_By_Flot,
	Set_Q_By_Flot<From_Typ>,
	Set_Long_By_Q<From_Typ>,
	Flot_Long$
{
	@Lin_Dclar void Set_Long_By_Flot(float By,long Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Flot_Long$(float By,long Valu){Set_Long_By_Flot(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long_By_Flot_Sorc(float By,Flot$Long Sorc){Set_Long_By_Flot(By,Sorc.Flot$Long(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long1$1_By_Flot(float By,Long1$1 Fun,long Valu)
		{Set_Long_By_Flot(By,Fun.Long1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long1$1_By_Flot_Sorc(float By,Long1$1 Fun,Flot$Long Sorc)
			{Set_Long1$1_By_Flot(By,Fun,Sorc.Flot$Long(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long1$1_By_Flot(float By,Long1$1 Fun)
				{Set_Long1$1_By_Flot_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long2$1_By_Flot(float By,Long2$1 Fun,long A,long B)
		{Set_Long_By_Flot(By,Fun.Long2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long2$1_By_Flot_SLit(float By,Long2$1 Fun,Flot$Long A,long B)
			{Set_Long2$1_By_Flot(By,Fun,A.Flot$Long(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long2$1_By_Flot(float By,Long2$1 Fun,long B)
				{Set_Long2$1_By_Flot_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Long2$1_By_Flot_Sorc(float By,Long2$1 Fun,Flot$Long A,Flot$Long B)
				{Set_Long2$1_By_Flot_SLit(By,Fun,A,B.Flot$Long(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Long2$1_By_Flot_Sorc(float By,Long2$1 Fun,Flot$Long B)
					{Set_Long2$1_By_Flot_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default long SGet_Long_By_Flot(float By,long Valu)
	{
		long Stor=Get_Long_By_Flot(By);
		Set_Long_By_Flot(By,Valu);

		return Stor;
	}
}