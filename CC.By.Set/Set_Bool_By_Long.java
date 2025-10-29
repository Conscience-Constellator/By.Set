package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Bool_By_Long;
import CC.Util.By.Set_Q_By_Q;
import CC.$.Q$Q.Bool$Bool;
import CC.$.Q$Q.Long$Bool;
import CC.$.Q2$.Long_Bool$;
import CC.$.Q_Q$Q.Bool2$1;

public interface Set_Bool_By_Long<From_Typ> extends
	Get_Bool_By_Long,
	Set_Q_By_Q<From_Typ>,
	Long_Bool$
{
	@Lin_Dclar void Set_Bool_By_Long(long By,boolean Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Long_Bool$(long By,boolean Valu){Set_Bool_By_Long(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool_By_Long_Sorc(long By,Long$Bool Sorc){Set_Bool_By_Long(By,Sorc.Long$Bool(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool1$1_By_Long(long By,Bool$Bool Fun,boolean Valu)
		{Set_Bool_By_Long(By,Fun.Bool$Bool(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool1$1_By_Long_Sorc(long By,Bool$Bool Fun,Long$Bool Sorc)
			{Set_Bool1$1_By_Long(By,Fun,Sorc.Long$Bool(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool1$1_By_Bool(long By,Bool$Bool Fun)
				{Set_Bool1$1_By_Long_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool2$1_By_Long(long By,Bool2$1 Fun,boolean A,boolean B)
		{Set_Bool_By_Long(By,Fun.Bool2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool2$1_By_Long_SLit(long By,Bool2$1 Fun,Long$Bool A,boolean B)
			{Set_Bool2$1_By_Long(By,Fun,A.Long$Bool(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool2$1_By_Long(long By,Bool2$1 Fun,boolean B)
				{Set_Bool2$1_By_Long_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Bool2$1_By_Long_Sorc(long By,Bool2$1 Fun,Long$Bool A,Long$Bool B)
				{Set_Bool2$1_By_Long_SLit(By,Fun,A,B.Long$Bool(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Bool2$1_By_Bool_Sorc(long By,Bool2$1 Fun,Long$Bool B)
					{Set_Bool2$1_By_Long_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default boolean SGet_Bool_By_Long(long By,boolean Valu)
	{
		boolean Stor=Get_Bool_By_Long(By);
		Set_Bool_By_Long(By,Valu);

		return Stor;
	}
}