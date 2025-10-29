package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Long_By_Dubl;
import CC.Util.By.LMNt.Set_Long_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Dubl;
import CC.$.Q$Q.Dubl$Long;
import CC.$.Q$Q.Long1$1;
import CC.$.Q2$.Dubl_Long$;
import CC.$.Q_Q$Q.Long2$1;

public interface Set_Long_By_Dubl<From_Typ> extends
	Get_Long_By_Dubl,
	Set_Q_By_Dubl<From_Typ>,
	Set_Long_By_Q<From_Typ>,
	Dubl_Long$
{
	@Lin_Dclar void Set_Long_By_Dubl(double By,long Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Dubl_Long$(double By,long Valu){Set_Long_By_Dubl(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long_By_Dubl_Sorc(double By,Dubl$Long Sorc){Set_Long_By_Dubl(By,Sorc.Dubl$Long(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long1$1_By_Dubl(double By,Long1$1 Fun,long Valu)
		{Set_Long_By_Dubl(By,Fun.Long1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long1$1_By_Dubl_Sorc(double By,Long1$1 Fun,Dubl$Long Sorc)
			{Set_Long1$1_By_Dubl(By,Fun,Sorc.Dubl$Long(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long1$1_By_Dubl(double By,Long1$1 Fun)
				{Set_Long1$1_By_Dubl_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long2$1_By_Dubl(double By,Long2$1 Fun,long A,long B)
		{Set_Long_By_Dubl(By,Fun.Long2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long2$1_By_Dubl_SLit(double By,Long2$1 Fun,Dubl$Long A,long B)
			{Set_Long2$1_By_Dubl(By,Fun,A.Dubl$Long(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long2$1_By_Dubl(double By,Long2$1 Fun,long B)
				{Set_Long2$1_By_Dubl_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Long2$1_By_Dubl_Sorc(double By,Long2$1 Fun,Dubl$Long A,Dubl$Long B)
				{Set_Long2$1_By_Dubl_SLit(By,Fun,A,B.Dubl$Long(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Long2$1_By_Dubl_Sorc(double By,Long2$1 Fun,Dubl$Long B)
					{Set_Long2$1_By_Dubl_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default long SGet_Long_By_Dubl(double By,long Valu)
	{
		long Stor=Get_Long_By_Dubl(By);
		Set_Long_By_Dubl(By,Valu);

		return Stor;
	}
}