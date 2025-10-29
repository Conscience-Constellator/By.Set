package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Bool_By_Short;
import CC.Util.By.Set_Q_By_Q;
import CC.$.Q$Q.Bool$Bool;
import CC.$.Q$Q.Short$Bool;
import CC.$.Q2$.Short_Bool$;
import CC.$.Q_Q$Q.Bool2$1;

public interface Set_Bool_By_Short<From_Typ> extends
	Get_Bool_By_Short,
	Set_Q_By_Q<From_Typ>,
	Short_Bool$
{
	@Lin_Dclar void Set_Bool_By_Short(short By,boolean Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Short_Bool$(short By,boolean Valu){Set_Bool_By_Short(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool_By_Short_Sorc(short By,Short$Bool Sorc){Set_Bool_By_Short(By,Sorc.Short$Bool(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool1$1_By_Short(short By,Bool$Bool Fun,boolean Valu)
		{Set_Bool_By_Short(By,Fun.Bool$Bool(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool1$1_By_Short_Sorc(short By,Bool$Bool Fun,Short$Bool Sorc)
			{Set_Bool1$1_By_Short(By,Fun,Sorc.Short$Bool(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool1$1_By_Short(short By,Bool$Bool Fun)
				{Set_Bool1$1_By_Short_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool2$1_By_Short(short By,Bool2$1 Fun,boolean A,boolean B)
		{Set_Bool_By_Short(By,Fun.Bool2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool2$1_By_Short_SLit(short By,Bool2$1 Fun,Short$Bool A,boolean B)
			{Set_Bool2$1_By_Short(By,Fun,A.Short$Bool(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool2$1_By_Short(short By,Bool2$1 Fun,boolean B)
				{Set_Bool2$1_By_Short_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Bool2$1_By_Short_Sorc(short By,Bool2$1 Fun,Short$Bool A,Short$Bool B)
				{Set_Bool2$1_By_Short_SLit(By,Fun,A,B.Short$Bool(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Bool2$1_By_Short_Sorc(short By,Bool2$1 Fun,Short$Bool B)
					{Set_Bool2$1_By_Short_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default boolean SGet_Bool_By_Short(short By,boolean Valu)
	{
		boolean Stor=Get_Bool_By_Short(By);
		Set_Bool_By_Short(By,Valu);

		return Stor;
	}
}