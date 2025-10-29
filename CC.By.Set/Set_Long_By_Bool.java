package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Long_By_Bool;
import CC.Util.By.LMNt.Set_Long_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Bool;
import CC.$.Q$Q.Bool$Long;
import CC.$.Q$Q.Long1$1;
import CC.$.Q_Q$.Bool_Long$;
import CC.$.Q_Q$Q.Long2$1;

public interface Set_Long_By_Bool<From_Typ> extends
	Get_Long_By_Bool,
	Set_Q_By_Bool<From_Typ>,
	Set_Long_By_Q<From_Typ>,
	Bool_Long$
{
	@Lin_Dclar void Set_Long_By_Bool(boolean By,long Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Bool_Long$(boolean By,long Valu){Set_Long_By_Bool(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long_By_Bool_Sorc(boolean By,Bool$Long Sorc){Set_Long_By_Bool(By,Sorc.Bool$Long(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long1$1_By_Bool(boolean By,Long1$1 Fun,long Valu)
		{Set_Long_By_Bool(By,Fun.Long1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long1$1_By_Bool_Sorc(boolean By,Long1$1 Fun,Bool$Long Sorc)
			{Set_Long1$1_By_Bool(By,Fun,Sorc.Bool$Long(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long1$1_By_Bool(boolean By,Long1$1 Fun)
				{Set_Long1$1_By_Bool_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long2$1_By_Bool(boolean By,Long2$1 Fun,long A,long B)
		{Set_Long_By_Bool(By,Fun.Long2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long2$1_By_Bool_SLit(boolean By,Long2$1 Fun,Bool$Long A,long B)
			{Set_Long2$1_By_Bool(By,Fun,A.Bool$Long(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long2$1_By_Bool(boolean By,Long2$1 Fun,long B)
				{Set_Long2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Long2$1_By_Bool_Sorc(boolean By,Long2$1 Fun,Bool$Long A,Bool$Long B)
				{Set_Long2$1_By_Bool_SLit(By,Fun,A,B.Bool$Long(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Long2$1_By_Bool_Sorc(boolean By,Long2$1 Fun,Bool$Long B)
					{Set_Long2$1_By_Bool_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default long SGet_Long_By_Bool(boolean By,long Valu)
	{
		long Stor=Get_Long_By_Bool(By);
		Set_Long_By_Bool(By,Valu);

		return Stor;
	}
}