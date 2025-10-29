package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Short_By_Short;
import CC.Util.By.LMNt.Set_Q_By_Short;
import CC.Util.By.LMNt.Set_Short_By_Q;
import CC.$.Q$Q.Short1$1;
import CC.$.Q2$.Short_Short$;
import CC.$.Q_Q$Q.Short2$1;

public interface Set_Short_By_Short<From_Typ> extends
	Get_Short_By_Short,
	Set_Q_By_Short<From_Typ>,
	Set_Short_By_Q<From_Typ>,
	Short_Short$
{
	@Lin_Dclar void Set_Short_By_Short(short By,short Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Short_Short$(short By,short Valu){Set_Short_By_Short(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short_By_Short_Sorc(short By,Short1$1 Sorc){Set_Short_By_Short(By,Sorc.Short1$1(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short1$1_By_Short(short By,Short1$1 Fun,short Valu)
		{Set_Short_By_Short(By,Fun.Short1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short1$1_By_Short_Sorc(short By,Short1$1 Fun,Short1$1 Sorc)
			{Set_Short1$1_By_Short(By,Fun,Sorc.Short1$1(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short1$1_By_Short(short By,Short1$1 Fun)
				{Set_Short1$1_By_Short_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short2$1_By_Short(short By,Short2$1 Fun,short A,short B)
		{Set_Short_By_Short(By,Fun.Short2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short2$1_By_Short_SLit(short By,Short2$1 Fun,Short1$1 A,short B)
			{Set_Short2$1_By_Short(By,Fun,A.Short1$1(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short2$1_By_Short(short By,Short2$1 Fun,short B)
				{Set_Short2$1_By_Short_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Short2$1_By_Short_Sorc(short By,Short2$1 Fun,Short1$1 A,Short1$1 B)
				{Set_Short2$1_By_Short_SLit(By,Fun,A,B.Short1$1(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Short2$1_By_Short_Sorc(short By,Short2$1 Fun,Short1$1 B)
					{Set_Short2$1_By_Short_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default short SGet_Short_By_Short(short By,short Valu)
	{
		short Stor=Get_Short_By_Short(By);
		Set_Short_By_Short(By,Valu);

		return Stor;
	}
}